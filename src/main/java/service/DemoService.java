package service;

import domain.Question;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class DemoService {

    private final QuestionService questionService;

    public void demo() throws Exception {
        List<Question> questionList = questionService.getAll();
        for (int i = 0; i < questionList.size(); i++) {
            for (int j = 1; j < questionList.get(i).getQuestion().length()-1; j++) {
                System.out.print(questionList.get(i).getQuestion().toCharArray()[j]);
            }
            System.out.println();
        }
    }


}
