package com.samsung.service;

import com.samsung.dao.QuestionDao;

import com.samsung.domain.Question;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService{

    private final QuestionDao dao;

    @Override
    public List<Question> getAll(){
        return dao.findAll();
    }
}
