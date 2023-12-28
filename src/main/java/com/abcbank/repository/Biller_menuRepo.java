package com.abcbank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abcbank.model.Biller_menu;
@Repository
public interface Biller_menuRepo extends JpaRepository<Biller_menu, Integer>{

}
