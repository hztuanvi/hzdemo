package com.hz.form;

import com.hz.validator.MaxlengthCheck;
import com.hz.validator.PhoneNumberCheck;
import com.hz.validator.RequiredCheck;

import lombok.Data;

/**
 * @author OS
 *
 */
@Data
public class StudentForm {

	private int id;

	@RequiredCheck
	@MaxlengthCheck(value = 50)
	private String name;

	@RequiredCheck
	private Integer classRoomId;

	@RequiredCheck
	private Integer roomId;

	@RequiredCheck
	private boolean gender;

	@RequiredCheck
	@PhoneNumberCheck
	private String phoneNumber;

}
