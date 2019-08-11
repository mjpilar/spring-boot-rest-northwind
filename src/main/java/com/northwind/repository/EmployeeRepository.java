package com.northwind.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.northwind.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
