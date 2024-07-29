package com.company.database.services;

import com.company.database.entity.Employees;

import java.util.List;
import java.util.Optional;

public interface EmployeesService {

    List<Employees> findAll();

    Optional<Employees> findById(int theId);

    Employees save(Employees theEmployees);

    void deleteById(int theId);

}
