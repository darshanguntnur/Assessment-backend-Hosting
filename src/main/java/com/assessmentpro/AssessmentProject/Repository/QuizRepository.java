package com.assessmentpro.AssessmentProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assessmentpro.AssessmentProject.Model.Quiz;


@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {
    // Custom methods for quiz-related operations
}
