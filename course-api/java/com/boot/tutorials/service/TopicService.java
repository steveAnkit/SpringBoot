package com.boot.tutorials.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.tutorials.beans.TopicBean;
import com.boot.tutorials.repository.TopicRepository;


@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;
	
	
	 public List<TopicBean> getTopicList()
	 {
		return (List<TopicBean>) topicRepository.findAll();
		 
	 }
	 
	 public TopicBean getTopic(String id)
	 {
		 
		 return topicRepository.findOne(id);
//		return topicList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	 }

	public void addTopic(TopicBean topicBean) {
		
		topicRepository.save(topicBean);
//		topicList.add(topicBean);
	}

	public void updateTopic(String id , TopicBean topicBean) {
		
		topicRepository.save(topicBean);
	}

	public void deleteTopic(String id) {
		topicRepository.delete(id);
//		topicList.removeIf(t -> t.getId().equals(id));
	}
	
}
