package com.samsung.dao;

import com.samsung.domain.Question;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface QuestionDao {
    List<Question> findAll();
}