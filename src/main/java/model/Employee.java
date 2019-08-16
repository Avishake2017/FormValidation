package model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Employee {
		@NotNull
		@Min(1)
		private Integer employeeId;
		
		
		@NotEmpty(message = "Employee name is required")
		@Size(min =3,max =12)
		private String employeeName;
		
		@Email(message = "Email should be of proper format")
		@NotEmpty(message = "Email should not be blank")
		private String email;
		
		@NotEmpty
		//@Pattern()
		private String contactNo;

		public Integer getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(Integer employeeId) {
			this.employeeId = employeeId;
		}

		public String getEmployeeName() {
			return employeeName;
		}

		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getContactNo() {
			return contactNo;
		}

		public void setContactNo(String contactNo) {
			this.contactNo = contactNo;
		}

		@Override
		public String toString() {
			return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email
					+ ", contactNo=" + contactNo + "]";
		}
		
		
}
