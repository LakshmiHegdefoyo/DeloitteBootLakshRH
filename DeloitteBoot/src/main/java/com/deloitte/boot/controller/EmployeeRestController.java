package com.deloitte.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.boot.model.Employee;
import com.deloitte.boot.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
	    @Autowired
	    EmployeeService es;
		@GetMapping("/employees")
        public List<Employee> getAllEmployees( ) {

			return es.getAllEmployees();
		}

        @GetMapping("/employees/{empId}")
        public Employee getEmployees(@PathVariable("empId") String empId) {
			Employee emp=es.getEmployee(empId);
			return emp;
		}

        @PostMapping ("/employees")
        public Employee addEmployee(@RequestBody Employee emp) {
        
        	Employee e=es.addEmployee(emp);
			
			return e;

        	}
        	
        	
        @PostMapping ("/employees/{empId}")
        public boolean deleteEmployee(@PathVariable("empId")String empId) {
        	
   
        	return es.deleteEmployee(empId);
        	
        	 
        }
        
        @PutMapping ("/employees")
        public Employee updateEmployee(@RequestBody Employee emp) {
      	return es.updateEmployee(emp);
        }
}
