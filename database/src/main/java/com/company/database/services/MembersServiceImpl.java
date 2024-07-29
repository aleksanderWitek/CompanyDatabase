package com.company.database.services;

import com.company.database.dao.MembersRepository;
import com.company.database.entity.Employees;
import com.company.database.entity.Members;

import java.util.Optional;

public class MembersServiceImpl implements MembersService{

    MembersRepository membersRepository;

    public MembersServiceImpl(MembersRepository membersRepository) {
        this.membersRepository = membersRepository;
    }

    @Override
    public Optional<Members> findById(int theId) {
        return membersRepository.findById(theId);
    }

    @Override
    public void deleteById(int theId) {
        membersRepository.deleteById(theId);
    }

    @Override
    public Members save(Members theEmployee) {
        return membersRepository.save(theEmployee);
    }

    @Override
    public int isActiveById(int theId) {
        return membersRepository.findById(theId).get().getIsActive();
    }

    @Override
    public void setPasswordById(int theId, String pw) {
        membersRepository.findById(theId).get().setPassword(pw);
    }
}
