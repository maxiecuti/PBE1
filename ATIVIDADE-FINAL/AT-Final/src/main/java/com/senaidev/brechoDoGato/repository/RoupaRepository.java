package com.senaidev.brechoDoGato.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senaidev.brechoDoGato.entities.Roupa;

@Repository
public interface RoupaRepository extends JpaRepository<Roupa, Long>{

}
