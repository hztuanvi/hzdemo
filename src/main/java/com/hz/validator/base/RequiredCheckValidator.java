package com.hz.validator.base;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.hz.validator.RequiredCheck;

/**
 * @author OS
 *
 */
public class RequiredCheckValidator implements ConstraintValidator<RequiredCheck, Object> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.validation.ConstraintValidator#isValid(java.lang.Object,
	 * javax.validation.ConstraintValidatorContext)
	 */
	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return value != null && !value.toString().trim().equals("");
	}

}
