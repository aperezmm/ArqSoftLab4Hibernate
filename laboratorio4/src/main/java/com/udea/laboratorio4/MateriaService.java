package com.udea.laboratorio4;

import java.util.List;

public interface MateriaService {
	
	public List<String> getAllCourseStudents(long courseId);
	
	public void addStudentToCourse(String name, String rendimiento, int edad, Long courseId);
	
}
