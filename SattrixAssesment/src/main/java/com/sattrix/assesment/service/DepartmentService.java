package com.sattrix.assesment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sattrix.assesment.entity.Department;
import com.sattrix.assesment.exception.ResourceNotFoundException;
import com.sattrix.assesment.repository.DepartmentRepository;

@Service
public class DepartmentService {
   @Autowired
   private DepartmentRepository departmentRepository;

   public List<Department> getAllDepartments() {
      return departmentRepository.findAll();
   }

   public Department getDepartmentById(Long id) {
      return departmentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException());
   }
}


