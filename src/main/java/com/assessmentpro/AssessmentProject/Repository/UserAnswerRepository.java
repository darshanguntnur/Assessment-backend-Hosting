package com.assessmentpro.AssessmentProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assessmentpro.AssessmentProject.Model.UserAnswers;


@Repository
public interface UserAnswerRepository extends JpaRepository<UserAnswers, Long> {
    // Custom methods for user answer-related operations
}

