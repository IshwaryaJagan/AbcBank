package com.abcbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abcbank.model.Creditordebit_request;

@Repository
public interface Creditordebit_requestRepo extends JpaRepository<Creditordebit_request, Integer> {

}
