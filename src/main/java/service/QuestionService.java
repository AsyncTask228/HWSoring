package service;

import domain.Question;

import java.util.List;

public interface QuestionService {
    List<Question> getAll() throws Exception;
}
