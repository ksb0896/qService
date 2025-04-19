package com.quiz.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.quiz.entity.Quiz;
import com.quiz.repo.quizRepo;
import com.quiz.service.QuizService;

@Service
public class QuizServiceImpl implements QuizService{
	
	//repo
	private quizRepo quizRepository;
	
	//constructor
	public QuizServiceImpl(quizRepo quizRepository) {
		this.quizRepository = quizRepository;
	}

	@Override
	public Quiz add(Quiz quiz) {
		return quizRepository.save(quiz);
	}

	@Override
	public List<Quiz> getAll() {
		return quizRepository.findAll();
	}

	@Override
	public Quiz getById(Integer id) {
		return quizRepository.findById(id).orElseThrow(()-> new RuntimeException("Quiz not found!!"));
	}

}
