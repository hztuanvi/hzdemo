package com.hz.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author OS
 *
 */
@Entity
@Table
@Data
public class ClassRoom {

	@Id
	@Column(name = "id")
	private int id;

	@OneToMany(mappedBy = "classRoom")
	private List<Student> students;

	@Column(name = "name")
	private String name;

}
