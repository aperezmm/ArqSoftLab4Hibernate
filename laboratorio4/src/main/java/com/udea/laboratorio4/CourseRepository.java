package com.udea.laboratorio4;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



public interface CourseRepository extends CrudRepository<Course,Long>{
   Course findByStudents(long studentId);
}
