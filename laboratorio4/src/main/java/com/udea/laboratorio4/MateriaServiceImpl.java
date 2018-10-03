package com.udea.laboratorio4;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MateriaServiceImpl implements MateriaService{
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<String> getAllCourseStudents(long courseId){
		List<String> result = new ArrayList<String>();
		List<Student> students = studentRepository.findByCourseId(courseId);
		for(Student student : students) {
			result.add(student.getName());
		}
		return result;
	}
	
	public void addStudentToCourse(String name, String rendimiento, int edad, Long courseId) {
		Course course = courseRepository.findById(courseId).get();
		Student newStudent = new Student();
		newStudent.setName(name);
		newStudent.setRendimiento(rendimiento);
		newStudent.setEdad(edad);
		newStudent.setCourse(course);
		studentRepository.save(newStudent);
	}
}
