package com.sattrix.assesment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sattrix.assesment.entity.Department;
import com.sattrix.assesment.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
   @Autowired
   private DepartmentService departmentService;

   @GetMapping("/")
   public List<Department> getAllDepartments() {
      return departmentService.getAllDepartments();
   }

   @GetMapping("/{id}")
   public Department getDepartmentById(@PathVariable Long id) {
      return departmentService.getDepartmentById(id);
   }
}
