package com.samsung.service;

import com.samsung.dao.QuestionDao;
import com.samsung.domain.Question;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

@DisplayName("QuestionServiceImpl")
@ExtendWith(MockitoExtension.class)
public class QuestionServiceImplTest {

    @InjectMocks
    private QuestionServiceImpl questionService;
    @Mock
    private QuestionDao questionDao;

    private List<Question> questions;

    @Test
    @DisplayName("getAll()")
    void getAllTest(){

        given(questionDao.findAll()).willReturn(questions);

        assertEquals(questions, questionService.getAll());

    }
}
