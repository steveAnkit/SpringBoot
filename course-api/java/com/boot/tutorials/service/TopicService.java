package com.boot.tutorials.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.boot.tutorials.beans.TopicBean;


@Service
public class TopicService {

	public List<TopicBean> topicList = new ArrayList<TopicBean>( Arrays.asList(
			new TopicBean("Math", "001", " math desc" ),
			new TopicBean("Physics", "002", " physics desc" ),
			new TopicBean("Chemistry", "003", " chemistary desc" )
			));
	
	
	 public List<TopicBean> getTopicList()
	 {
		 return topicList;
	 }
	 
	 public TopicBean getTopic(String id)
	 {
		return topicList.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	 }

	public void addTopic(TopicBean topicBean) {
		topicList.add(topicBean);
	}

	public void updateTopic(String id , TopicBean topicBean) {
		
		for(int i = 0 ; i < topicList.size() ; i++)
		{
			if(topicList.get(i).getId().equals(id))
			{
				topicList.set(i, topicBean);
				return;
			}
		}
	}

	public void deleteTopic(String id) {
		topicList.removeIf(t -> t.getId().equals(id));
	}
	
}
