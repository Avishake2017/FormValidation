package model;

import interfaces.DepartmentNameValidator;

public class Department {
		@DepartmentNameValidator
		private String departmentName;

		public String getDepartmentName() {
			return departmentName;
		}

		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}
		
}
