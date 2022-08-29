package com.samsung.service;

import com.samsung.domain.Question;
import org.springframework.stereotype.Service;

import java.util.List;


public interface QuestionService {
    List<Question> getAll();
}
