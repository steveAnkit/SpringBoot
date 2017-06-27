package com.boot.tutorials.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping("/topics/{id}")
	public TopicBean topic(@PathVariable String id)
	{
		return topicService.getTopic(id);
		
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody TopicBean topicBean)
	{
		topicService.addTopic(topicBean);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	public void updateTopic(@RequestBody TopicBean topicBean, @PathVariable String id)
	{
		topicService.updateTopic(id, topicBean);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
	public void deleteTopic(@PathVariable String id)
	{
		topicService.deleteTopic(id);
	}
	
}
