package com.abcbank.repository;

import java.math.BigInteger;
import org.springframework.data.jpa.repository.JpaRepository;
import com.abcbank.model.Account;

public interface AccountRepo extends JpaRepository<Account, BigInteger> {

}
