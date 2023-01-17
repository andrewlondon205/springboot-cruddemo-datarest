package com.luv2code.springboot.datarest.springbootcruddemodatarest.repository;

import com.luv2code.springboot.datarest.springbootcruddemodatarest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
