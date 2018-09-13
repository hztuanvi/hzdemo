package com.hz.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity(name = "room")
@Table(name = "room")
@Data
public class Room {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "building_id")
	private String buildingId;

	@OneToMany(mappedBy = "room")
	private List<Student> students;

	@Column(name = "delflg")
	private boolean delFlg;

}
