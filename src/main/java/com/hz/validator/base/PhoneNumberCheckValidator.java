package com.hz.validator.base;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.hz.validator.PhoneNumberCheck;

/**
 * @author OS
 *
 */
public class PhoneNumberCheckValidator implements ConstraintValidator<PhoneNumberCheck, String> {

	private static final String PATTERN_PHONE_NUMER = "(0)\\\\d{9,10}";

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.validation.ConstraintValidator#isValid(java.lang.Object,
	 * javax.validation.ConstraintValidatorContext)
	 */
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub

		return value.matches(PATTERN_PHONE_NUMER);
	}

}
