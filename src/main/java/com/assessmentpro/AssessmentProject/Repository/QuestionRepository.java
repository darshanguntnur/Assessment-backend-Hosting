package com.assessmentpro.AssessmentProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assessmentpro.AssessmentProject.Model.Questions;


@Repository
public interface QuestionRepository extends JpaRepository<Questions, Long> {
    // Custom methods for question-related operations
}
