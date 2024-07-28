package com.company.database.services;

import com.company.database.dao.EmployeesRepository;
import com.company.database.entity.Employees;

import java.util.List;
import java.util.Optional;

public class EmployeesServiceImpl implements EmployeesService{

    EmployeesRepository employeesRepository;

    public EmployeesServiceImpl(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }

    @Override
    public List<Employees> findAll() {
        return employeesRepository.findAllByOrderByLastNameAsc();
    }

    @Override
    public Optional<Employees> findById(int theId) {
        return employeesRepository.findById(theId);
    }

    @Override
    public Employees save(Employees theEmployees) {
        return employeesRepository.save(theEmployees);
    }

    @Override
    public void deleteById(int theId) {
        employeesRepository.deleteById(theId);
    }
}
