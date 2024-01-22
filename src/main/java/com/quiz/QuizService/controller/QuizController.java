package com.quiz.QuizService.controller;

import com.quiz.QuizService.entities.Quiz;
import com.quiz.QuizService.services.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    private QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }
    //CREATE REQUEST
    @PostMapping
    public Quiz create(@RequestBody Quiz quiz){
     return quizService.add(quiz);
    }
    //GET ALL
    @GetMapping
    public List<Quiz> get(){
        return quizService.get();
    }

    @GetMapping("/{id}")
    public Quiz getAll(@PathVariable Long id){
        return quizService.get(id);
    }
}
