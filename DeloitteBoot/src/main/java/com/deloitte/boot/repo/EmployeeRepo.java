package com.deloitte.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.deloitte.boot.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	@Query("from Employee where empId=:empId")
	Employee findByEmpId(String empId);
}
