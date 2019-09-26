package com.ics.cat1;

import com.ics.cat1.models.Date;
import com.ics.cat1.models.DateDto;
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

//    Request for a Date of your choice
        Date date_request = feignRestClient.requestDate(date_un.getId(), 16L, david.getId());
        System.out.println("Request for a Date of your choice: " + date_request.toString());

//        Reject Blind Date
        date_un.setReason("Underage");
        Date rejectDate = feignRestClient.rejectDate(date_un.getId(), new DateDto(david.getId(), "Underage"));
        System.out.println("Reject Blind Date: " + rejectDate.toString());
    }
}
