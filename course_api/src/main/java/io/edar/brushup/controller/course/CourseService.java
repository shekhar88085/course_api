package io.edar.brushup.controller.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
//	List<Course> topics= new ArrayList<>( Arrays.asList(
//			
//			new Course("Spring", "Spring Fra,ework", "S F Descriptiom"),
//			new Course("Java", "Java Name","Java description"),
//			new Course("react", "React name", "React dEsscription")
//			
//			));
	
	public List<Course> getAllCourses(String topicId){
		//return topics;
		List<Course> courses=new ArrayList<>();
		courseRepository.findByTopicId(topicId)
		.forEach(courses::add);
		return courses;
		
	}
	
	public Course getCourse(String id) {
		
		//return cours.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return courseRepository.findById(id).orElse(null);
		
	}
	
	public void addCourse(Course topic ) {
		//topics.add(topic);
		courseRepository.save(topic);
	}

	public void updateCourse(Course topic) {
		// TODO Auto-generated method stub
//		for(int i=0;i<topics.size();i++) {
//			Topic t=topics.get(i);
//			if(t.getId().equals(id)) {
//				topics.set(i, topic);
//				return;
//			}
//		}
		courseRepository.save(topic);
	}

	public void deleteCourse(String id) {
//		topics.removeIf(t->t.getId().equals(id));
		courseRepository.deleteById(id);
		
	}
	
} 


















