package com.hz.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author OS
 *
 */
@Entity(name = "student")
@Table(name = "student")
@Data
public class Student {

	@Id
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "room_id")
	private String roomId;

	@Column(name = "classRoom_Id")
	private String classRoomId;

	@ManyToOne
	@JoinColumn(name = "classRoom_Id", insertable = false, updatable = false)
	private ClassRoom classRoom;

	@ManyToOne
	@JoinColumn(name = "room_id", insertable = false, updatable = false)
	private Room room;

	@Column(name = "gender")
	private boolean gender;

	@Column(name = "phonenumber")
	private String phoneNumber;

	@Column(name = "delflg")
	private boolean delFlg;
}
