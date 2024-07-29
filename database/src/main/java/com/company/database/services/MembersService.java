package com.company.database.services;

import com.company.database.entity.Employees;
import com.company.database.entity.Members;

import java.util.Optional;

public interface MembersService {

    Optional<Members> findById(int theId);

    void deleteById(int theId);

    Members save(Members theEmployee);

    int isActiveById(int theId);

    void setPasswordById(int theId, String pw);
}
