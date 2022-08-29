package com.samsung.dao;


import com.samsung.domain.Question;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("resources")
public class QuestionDaoSimple implements QuestionDao {

    private List<Question> questions;
    private final String pathToCsv;

    public QuestionDaoSimple(String pathToCsv) {
        this.pathToCsv = pathToCsv;
    }

    @Override
    public List<Question> findAll() {
        if(questions != null) return questions;
        questions = new ArrayList<>();
        BufferedReader csvReader = null;
        try {
            csvReader = new BufferedReader(new FileReader(
                    pathToCsv));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String row = null;
        while (true) {
            try {
                if ((row = csvReader.readLine()) == null)
                    break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            String[] data = row.split(";");
            questions.add(new Question(data[0], data[1]));
        }
        try {
            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return questions;
    }
}
