package interfaces;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import model.DepartmentValidator;
@Constraint(validatedBy=DepartmentValidator.class)
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface DepartmentNameValidator {
	String message() default "Invalid department";
	Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
