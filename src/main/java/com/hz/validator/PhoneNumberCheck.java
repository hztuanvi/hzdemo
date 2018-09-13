package com.hz.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.hz.validator.base.PhoneNumberCheckValidator;

/**
 * @author OS
 *
 */
@Documented
@Constraint(validatedBy = PhoneNumberCheckValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface PhoneNumberCheck {

	String message() default "{validator.phonenumber}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
