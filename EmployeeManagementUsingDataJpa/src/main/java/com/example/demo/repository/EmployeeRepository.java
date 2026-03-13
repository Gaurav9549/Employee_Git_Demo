package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>  {
	// persist() --> create
	// merge() --> update
	// remove() --> remove
	// find() --> search
	// createQuery--> for multi row operations

	@Query("select e from Employee e where e.empDesg=?1")
	public abstract List<Employee> getEmployeeByDesg(String empDesg);
	@Query("select e from Employee e where e.empSal between ?1 and ?2")
	public abstract List<Employee> getEmployeesBetweenSal(int initialSal, int finalSal);

}
 //Repository
//Important QUestion:
// Difference between Crud Repository and 
// JPA Repository--for pagination