package com.abcbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abcbank.model.Lostorstolen_request;

@Repository
public interface Lostorstolen_requestRepo extends JpaRepository<Lostorstolen_request, Integer> {
}