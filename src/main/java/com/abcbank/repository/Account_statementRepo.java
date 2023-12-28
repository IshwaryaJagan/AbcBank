package com.abcbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abcbank.model.Account_statement;

public interface Account_statementRepo extends JpaRepository<Account_statement, Integer> {

}
