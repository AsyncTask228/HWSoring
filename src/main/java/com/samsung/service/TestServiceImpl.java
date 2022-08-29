package com.samsung.service;

import com.samsung.domain.Question;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
@PropertySource({"application.yml"})
public class TestServiceImpl implements TestService{

    private final QuestionService questionService;
    private final int doorstep;
    private int point;
    private final Scanner scanner = new Scanner(System.in);
    private String name;


    public TestServiceImpl(QuestionService questionService, @Value("${thresholdPfPassage}") int doorstep) {

        this.questionService = questionService;
        this.doorstep = doorstep;
    }

    @Override
    public void editName() {

        name = scanner.next();
    }

    @Override
    public void test() {
        point = 0;
        Scanner scanner = new Scanner(System.in);
        List<Question> questionList = questionService.getAll();

        questionList.forEach((q) -> {

            System.out.println(q.getQuestion());
            String personAnswer = scanner.next();

            if (personAnswer.equals(q.getAnswer())){
                point++;
            }
        });
    }

    @Override
    public void showMark() {
        if (point >= doorstep){
            System.out.println(name + ", Your mark is: " + point + ". You passed the exam, congratulations!");
        } else {
            System.out.println(name + ", Your mark is: " + point + ". You didn't pass the exam, try again another time!");
        }
    }
}
