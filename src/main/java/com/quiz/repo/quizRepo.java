package com.quiz.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quiz.entity.Quiz;

public interface quizRepo extends JpaRepository<Quiz, Integer>{

}
