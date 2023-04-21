package com.sattrix.assesment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sattrix.assesment.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

