package io.edar.brushup.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class topicController {
	
	@Autowired
	private topicService topicservice;
	 
	
	@RequestMapping("/topics") 
	public List<Topic> getAllTopics() {
		return topicservice.getAllTopics();
	} 
	
	//getting topic url by id
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicservice.getTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicservice.addTopic(topic);
	}
	
}
