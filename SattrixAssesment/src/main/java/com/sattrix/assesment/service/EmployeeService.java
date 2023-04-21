package com.sattrix.assesment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sattrix.assesment.entity.Employee;
import com.sattrix.assesment.exception.ResourceNotFoundException;
import com.sattrix.assesment.repository.EmployeeRepository;

@Service
public class EmployeeService {
   @Autowired
   private EmployeeRepository employeeRepository;

   public List<Employee> getAllEmployees() {
      return employeeRepository.findAll();
   }

   public Employee getEmployeeById(Long id) {
      return employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException());
   }

   public Employee addEmployee(Employee employee) {
      return employeeRepository.save(employee);
   }

   public List<Employee> getEmployeesByDepartmentName(String departmentName) {
      return employeeRepository.findByDepartmentDepartmentName(departmentName);
   }
}

