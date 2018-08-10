package com.enjoying.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.enjoying.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
