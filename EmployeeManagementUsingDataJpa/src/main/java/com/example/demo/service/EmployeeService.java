package com.example.demo.service;

import java.util.List;

import com.example.demo.exception.EmployeeNotFound;
import com.example.demo.model.Employee;

public interface EmployeeService {
	public abstract String saveEmployee(Employee employee);// persist()

	public abstract String updateEmployee(Employee employee);// merge()

	public abstract String deleteEmployee(int empId);// remove()

	public abstract Employee getEmployee(int empId) throws EmployeeNotFound; // find()

	public abstract List<Employee> getAllEmployees(); // createQuery("query")

	public abstract List<Employee> getEmployeeByDesg(String empDesg);

	public abstract List<Employee> getEmployeesBetweenSal(int initialSal, int finalSal);


}
