package com.company.database.dao;

import com.company.database.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeesRepository extends JpaRepository<Employees, Integer> {

    List<Employees> findAllByOrderByLastNameAsc();
}
