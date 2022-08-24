package domain;

import lombok.AllArgsConstructor;

import java.util.Objects;

@AllArgsConstructor
public class Question {

    private String question;

    public String getQuestion() {

        return question;
    }

    @Override
    public String toString() {
        return question;
    }

}
