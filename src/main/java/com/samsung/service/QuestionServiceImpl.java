package com.samsung.service;

import com.samsung.dao.QuestionDao;

import com.samsung.domain.Question;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class QuestionServiceImpl implements QuestionService{

    private final QuestionDao dao;

    @Override
    public List<Question> getAll(){
        return dao.findAll();
    }
}
