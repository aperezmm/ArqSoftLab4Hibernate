package com.udea.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udea.model.*;

public interface CourseRepository extends CrudRepository<Course,Long>{
   Course findByStudents(long studentId);
}
