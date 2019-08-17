package controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Department;
import model.Employee;

@Controller
public class PageController {
		
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String getHomePage(){
		System.out.println("Hello");
		return "HomePage";
	}
	
	
	@RequestMapping(value="Form",method=RequestMethod.GET)
	public String getForm(ModelMap map){
		map.addAttribute("emp",new Employee());
		return "EmployeeForm";
	}
	
	@RequestMapping(value="SubmitForm",method=RequestMethod.POST)
	public String SubmitForm(@Valid @ModelAttribute("emp")Employee emp,BindingResult result){
		
		if(result.hasErrors()) {
			System.out.println("Im in employee form");
			return "EmployeeForm";
		}
		
			System.out.println("Im in view employee");
			return "ViewEmployee";
		
	}
	@RequestMapping("/validateDepartment")
	public String loadDepartmentPage(ModelMap map) {
		map.addAttribute("department", new Department());
		return "DepartmentForm";
	}
	 @RequestMapping("/addvalidateDepartment")
	    public String submitDepartment(@Valid Department department,
	      BindingResult result, ModelMap map) {
	        if(result.hasErrors()) {
	            return "DepartmentForm";
	        }
	        map.addAttribute("message", "Successfully saved department: "
	          + department.toString());
	        return "ViewDepartment";
	    }   
	}
	

