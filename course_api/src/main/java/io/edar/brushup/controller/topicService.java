package io.edar.brushup.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class topicService {

	List<Topic> topics= new ArrayList<>( Arrays.asList(
			
			new Topic("Spring", "Spring Fra,ework", "S F Descriptiom"),
			new Topic("Java", "Java Name","Java description"),
			new Topic("react", "React name", "React dEsscription")
			
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
} 
