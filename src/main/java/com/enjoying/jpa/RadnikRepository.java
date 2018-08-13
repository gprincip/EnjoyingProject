package com.enjoying.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enjoying.model.radnik;

@Repository
public interface RadnikRepository extends JpaRepository<radnik, Integer>{

}
