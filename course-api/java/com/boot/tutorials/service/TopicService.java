package com.boot.tutorials.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.boot.tutorials.beans.TopicBean;


@Service
public class TopicService {

	public List<TopicBean> topicList =  (List<TopicBean>) Arrays.asList(
			new TopicBean("Math", 001, " math desc" ),
			new TopicBean("Physics", 002, " physics desc" ),
			new TopicBean("Chemistry", 003, " chemistary desc" )
			);
	
	
	 public List<TopicBean> getTopicList()
	 {
		 return topicList;
	 }
	
}
