package com.hz.validator.base;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.hz.validator.MaxlengthCheck;

/**
 * @author OS
 *
 */
public class MaxlengthCheckValidator implements ConstraintValidator<MaxlengthCheck, String> {

	private int max;

	@Override
	public void initialize(MaxlengthCheck constraintAnnotation) {
		max = constraintAnnotation.value();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return max >= value.length();
	}

}
