package com.boot.tutorials.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.tutorials.beans.TopicBean;
import com.boot.tutorials.service.TopicService;


@RestController
public class TopicController {
	
	
	@Autowired
	private TopicService topicService; 

	@RequestMapping("/topics")
	public List<TopicBean> topics()
	{
		return ((TopicService) topicService).getTopicList();
	}
	
}
