package com.quiz.QuizService.impl;

import com.quiz.QuizService.entities.Quiz;
import com.quiz.QuizService.repositories.QuizRepository;
import com.quiz.QuizService.services.QuizService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuizImplService implements QuizService {
    private QuizRepository quizRepository;

    public QuizImplService(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

    @Override
    public Quiz add(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public List<Quiz> get() {
        return quizRepository.findAll();
    }

    @Override
    public Quiz get(Long id) {
        return quizRepository.findById(id).orElseThrow(()-> new RuntimeException("Quiz not found"));
    }
}
