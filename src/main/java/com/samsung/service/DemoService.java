package com.samsung.service;

import com.samsung.domain.Question;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class DemoService {

    private final QuestionService questionService;

    public void demo() {

        List<Question> questionList = questionService.getAll();

        questionList.forEach((q) -> System.out.println(q.getQuestion()));
    }
}