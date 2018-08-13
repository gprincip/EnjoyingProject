package com.enjoying.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.enjoying.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	@Query("from Student st where st.name = :username")
	public List<Student> findStudent(@Param("username") String username);
}
