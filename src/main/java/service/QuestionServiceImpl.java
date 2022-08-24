package service;

import dao.QuestionDao;
import domain.Question;

import java.util.List;

public class QuestionServiceImpl implements QuestionService{

    private QuestionDao dao;

    public QuestionServiceImpl(QuestionDao dao) {

        this.dao = dao;
    }

    @Override
    public List<Question> getAll() throws Exception {
        return dao.findAll();
    }
}
