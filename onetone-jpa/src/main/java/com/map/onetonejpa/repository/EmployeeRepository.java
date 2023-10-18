package com.map.onetonejpa.repository;

import com.map.onetonejpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
