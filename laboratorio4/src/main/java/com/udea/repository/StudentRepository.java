package com.udea.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.udea.model.*;

public interface StudentRepository extends CrudRepository<Student,Long>{
	List<Student> findByCourseId(long courseId);	
}
