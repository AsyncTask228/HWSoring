package dao;

import com.opencsv.CSVReader;
import domain.Question;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("resources")
public class QuestionDaoSimple implements QuestionDao {

    private List<Question> questions;
    private final String pathToCsv;

    public QuestionDaoSimple(String pathToCsv) {
        this.pathToCsv = pathToCsv;
    }

    @Override
    public List<Question> findAll() throws Exception {

        if (questions == null) {
            questions = new ArrayList<>();
            CSVReader reader = new CSVReader(new FileReader(pathToCsv));

            List<String[]> allRows = reader.readAll();

            for (String[] row : allRows) {
                questions.add(new Question(Arrays.toString(row)));
            }

        }

        return questions;

    }
}
