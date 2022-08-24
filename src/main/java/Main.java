import com.opencsv.CSVReader;
import domain.Question;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.DemoService;
import service.QuestionService;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {



    public static void main(String[] args) throws Exception {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("/spring-context.xml");
        new DemoService(context.getBean(QuestionService.class)).demo();
    }
}
