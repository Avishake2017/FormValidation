package model;

import java.lang.annotation.Annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import interfaces.DepartmentNameValidator;

public class DepartmentValidator implements ConstraintValidator<DepartmentNameValidator,String> {


	
	
	public boolean isValid(String departmentName, ConstraintValidatorContext cxt) {
		
		if(departmentName==null){
			return false;
		}
		else if(departmentName!="hr") {
		return false;
		}
		return true;
}

public void initialize(DepartmentNameValidator departmentName) {
		
		
	}

	
}
