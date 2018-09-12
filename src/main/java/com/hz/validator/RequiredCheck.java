package com.hz.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.hz.validator.base.RequiredCheckValidator;

/**
 * @author OS
 *
 */
@Documented
@Constraint(validatedBy = RequiredCheckValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface RequiredCheck {

	String message() default "{validator.required}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
