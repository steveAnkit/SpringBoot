package com.boot.tutorials.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.tutorials.beans.TopicBean;


@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<TopicBean> topics()
	{
		return Arrays.asList(
				new TopicBean("Math", 001, " math desc" ),
				new TopicBean("Physics", 002, " physics desc" ),
				new TopicBean("Chemistry", 003, " chemistary desc" )
				);
	}
	
}
