package com.udea.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,	generator =	"student_Sequence")
	
	@SequenceGenerator(name = "student_Sequence", sequenceName = "STUDENT_SEQ")
	
	private Long id;
	
	@Column(name = "name")
	private String	name;
	
	@Column(name = "edad")
	private int edad;
	
	@Column(name = "rendimiento")
	private String	rendimiento;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id",	nullable = false)
	private Course course;
	
}
