package com.quiz.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.entity.Quiz;
import com.quiz.service.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {

	//service impl
	private QuizService quizService;
	//constructor
	public QuizController(QuizService quizService) {
		this.quizService = quizService;
	}
	
	//create
	@PostMapping
	public Quiz create(@RequestBody Quiz quiz) {
		return quizService.add(quiz);
	}
	
	//get all
	@GetMapping("/getAll")
	public List<Quiz> getAll(){
		return quizService.getAll();
	}
	
	//get by id
	@GetMapping("/getById/{id}")
	public Quiz getById(@PathVariable("id") Integer id){
		return quizService.getById(id);
	}

}
