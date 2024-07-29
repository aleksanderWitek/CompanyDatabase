package com.company.database.dao;


import com.company.database.entity.Members;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembersRepository extends JpaRepository<Members, Integer> {

}
