package com.ics.cat1;

//import com.ics.cat1.models.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CatConnection implements CommandLineRunner {
    private final FeignRestClient feignRestClient;

    public CatConnection(FeignRestClient feignRestClient) {
        this.feignRestClient = feignRestClient;
    }

    @Override
    public void run(String... args) throws Exception {
//        Student student = feignRestClient.registerStudent(new Student("John Kariuki", 95937));
//        System.out.println("Registered Student: " + student.toString());
    }
}
