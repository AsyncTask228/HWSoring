package com.samsung.dao;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("QuestionDao")
public class QuestionDaoSimpleTest {

    private final String csvPath = "src/test/java/com/samsung/resources/questionsTest.csv";
    private QuestionDaoSimple questionDaoSimple;

    @BeforeEach
    void update(){

        questionDaoSimple = new QuestionDaoSimple(csvPath);
    }

    @Test
    @DisplayName("Должен находить все вопросы")
    void mustFindAllQuestions(){

        int[] testMass = new int[5];

        assertEquals(questionDaoSimple.findAll().size(), testMass.length);
    }

}
