package io.edar.brushup.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class topicService {

	@Autowired
	private topicsRepository topicRepository;
	
	List<Topic> topics= new ArrayList<>( Arrays.asList(
			
			new Topic("Spring", "Spring Fra,ework", "S F Descriptiom"),
			new Topic("Java", "Java Name","Java description"),
			new Topic("react", "React name", "React dEsscription")
			
			));
	
	public List<Topic> getAllTopics(){
		//return topics;
		List<Topic> topics=new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
		
	}
	
	public Topic getTopic(String id) {
		
		//return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return topicRepository.findById(id).orElse(null);
	}
	
	public void addTopic(Topic topic) {
		//topics.add(topic);
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		// TODO Auto-generated method stub
//		for(int i=0;i<topics.size();i++) {
//			Topic t=topics.get(i);
//			if(t.getId().equals(id)) {
//				topics.set(i, topic);
//				return;
//			}
//		}
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
//		topics.removeIf(t->t.getId().equals(id));
		topicRepository.deleteById(id);
		
	}
	
} 


















