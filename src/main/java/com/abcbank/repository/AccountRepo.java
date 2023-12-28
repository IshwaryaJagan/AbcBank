package com.abcbank.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abcbank.model.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, BigInteger>{

}
