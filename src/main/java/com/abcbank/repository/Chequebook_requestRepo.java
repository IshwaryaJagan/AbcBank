package com.abcbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abcbank.model.Chequebook_request;

@Repository
public interface Chequebook_requestRepo  extends JpaRepository<Chequebook_request, Integer> {

}
