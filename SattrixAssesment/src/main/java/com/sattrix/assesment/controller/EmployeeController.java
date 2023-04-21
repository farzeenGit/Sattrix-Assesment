package com.sattrix.assesment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sattrix.assesment.entity.Employee;
import com.sattrix.assesment.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
   @Autowired
   private EmployeeService employeeService;

   @GetMapping("/")
   public List<Employee> getAllEmployees() {
      return employeeService.getAllEmployees();
   }

   @GetMapping("/{id}")
   public Employee getEmployeeById(@PathVariable Long id) {
      return employeeService.getEmployeeById(id);
   }

   @PostMapping("/")
   public Employee addEmployee(@RequestBody Employee employee) {
      return employeeService.addEmployee(employee);
   }

   @GetMapping("/department/{departmentName}")
   public List<Employee> getEmployeesByDepartmentName(@PathVariable String departmentName) {
      return employeeService.getEmployeesByDepartmentName(departmentName);
   }
}

