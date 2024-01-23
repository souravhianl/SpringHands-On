package com.quiz.QuizService.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Question {
    private Long questionId;
    private String questions;
    private Long quizId;

}
