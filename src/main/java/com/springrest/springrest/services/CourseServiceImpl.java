package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import com.springrest.springrest.entities.Course;

public class CourseServiceImpl implements CourseService {
	
	List<Course> list;
	
	

	public CourseServiceImpl() {
		
		list = new ArrayList<>();
		list.add(new Course(145, "Django", "This Course contains the basic django"));
		list.add(new Course(145, "Node js", "This Course contains the basic Node js"));
		list.add(new Course(145, "Spring boot", "This Course contains the basic Spring Boot"));


	}



	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return null;
	}

}
