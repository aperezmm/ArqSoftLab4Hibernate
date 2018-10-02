package com.udea.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udea.model.*;

public interface CourserRepository extends CrudRepository<Course,Long>{
   Course findByStudents(long studentId);
}
