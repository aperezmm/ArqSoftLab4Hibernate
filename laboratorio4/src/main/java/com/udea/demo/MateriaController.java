package com.udea.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.UriComponentsBuilder;

import com.udea.model.Course;
import com.udea.repository.CourseRepository;
import com.udea.repository.StudentRepository;
import com.udea.service.MateriaService;

@Controller
@RequestMapping(path = "/materiaController")	
public class MateriaController {
	@Autowired
	private MateriaService materiaService;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	@PostMapping("/course")
	ResponseEntity<?>course(@RequestBody Course course,UriComponentsBuilder	ucBuilder){
		
		courseRepository.save(course);
		HttpHeaders headers = new HttpHeaders();
		
		headers.setLocation(ucBuilder.path("/materiaController/course/{id}").buildAndExpand(course.getId()).toUri());
		
		return new ResponseEntity<String>(headers, HttpStatus.CREATED);
	}
	
	@GetMapping(path = "/all/{id}")
	public @ResponseBody Iterable<String> getAllUsers(@PathVariable("id") Long courseId){
		
		return materiaService.getAllCourseStudents(courseId);
	}
}
