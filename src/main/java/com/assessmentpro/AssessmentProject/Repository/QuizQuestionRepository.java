package com.assessmentpro.AssessmentProject.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assessmentpro.AssessmentProject.Model.Quiz;
import com.assessmentpro.AssessmentProject.Model.QuizQuestion;


public interface QuizQuestionRepository extends JpaRepository<QuizQuestion, Long> {
    // Custom methods for quiz question-related operations
	public List<QuizQuestion> findByQuiz(Quiz quiz);
}