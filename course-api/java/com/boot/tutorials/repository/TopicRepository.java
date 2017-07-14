package com.boot.tutorials.repository;

import org.springframework.data.repository.CrudRepository;

import com.boot.tutorials.beans.TopicBean;

public interface TopicRepository extends CrudRepository<TopicBean, String> {

}
