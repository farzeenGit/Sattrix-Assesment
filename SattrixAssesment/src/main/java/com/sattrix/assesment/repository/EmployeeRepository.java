package com.sattrix.assesment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sattrix.assesment.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
   List<Employee> findByDepartmentDepartmentName(String departmentName);
}

