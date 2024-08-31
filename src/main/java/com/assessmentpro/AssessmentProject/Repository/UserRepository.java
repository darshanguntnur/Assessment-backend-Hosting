package com.assessmentpro.AssessmentProject.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assessmentpro.AssessmentProject.Model.Users;


@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    // Custom methods for user-related operations
	public List<Users> findByUsername(String username);
}
