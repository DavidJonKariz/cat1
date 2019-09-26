package com.ics.cat1;

import com.ics.cat1.models.Date;
import com.ics.cat1.models.Match;
import com.ics.cat1.models.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CatConnection implements CommandLineRunner {
    private final FeignRestClient feignRestClient;

    public CatConnection(FeignRestClient feignRestClient) {
        this.feignRestClient = feignRestClient;
    }

    @Override
    public void run(String... args) throws Exception {
//        Get All Matches
        List<Match> matches = feignRestClient.getAllMatches();
        System.out.println("All Matches: " + matches.toString());

//        Registration of Student
        Student david = feignRestClient.registerStudent(new Student(91937, "David Kariuki"));
        System.out.println("Registered Student: " + david.toString());

//    Request for a Blind Date
        Date date_un = feignRestClient.blindDate("FEMALE", david.getId());
        System.out.println("Request for a Blind Date: " + date_un.toString());

//        Reject Blind Date
//        date_un.setReason("I am underage.");
//        Date rejectDate = feignRestClient.rejectDate(date_un.getId(), date_un);
    }
}
