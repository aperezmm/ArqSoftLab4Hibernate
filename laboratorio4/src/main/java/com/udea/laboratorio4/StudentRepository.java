package com.udea.laboratorio4;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



public interface StudentRepository extends CrudRepository<Student,Long>{
	List<Student> findByCourseId(long courseId);	
}
