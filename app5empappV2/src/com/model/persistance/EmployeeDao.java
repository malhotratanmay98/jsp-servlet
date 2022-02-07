package com.model.persistance;

import java.sql.SQLException;
import java.util.*;
import java.util.function.Predicate;

import com.model.exceptions.DataAccessException;


public interface EmployeeDao {
	public Employee addEmployee(Employee employee);
	public Employee deleteEmployee(int id);
	public Employee updateEmployee(int id , Employee employee);
	public List<Employee> getAll()throws DataAccessException;
	public Optional<Employee> getById(int id);
}
