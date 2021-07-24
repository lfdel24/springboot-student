package com.lfdel24.springbootstudent.repository;

import com.lfdel24.springbootstudent.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author leo
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
