package com.ics.cat1;

import com.ics.cat1.models.Date;
import com.ics.cat1.models.Match;
import com.ics.cat1.models.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.awt.dnd.DropTarget;
import java.util.List;

@FeignClient(name = "davidClient", url = "10.51.10.111:2200", configuration = FeignConfig.class)
public interface FeignRestClient {
//    Get All Matches
    @GetMapping(value = "matches")
    List<Match> getAllMatches();

//    Register Student
    @PostMapping(value = "students")
    Student registerStudent(@RequestBody Student student);

//    Request for a Blind Date
    @PostMapping(value = "matches")
    Date blindDate(@RequestParam(name = "gender") String gender, @RequestParam(name = "studentId") Long studentId);

//    Reject Blind Date
    @PatchMapping("matches/{dateId}")
    Date rejectDate(@PathVariable("dateId") Long dateId, Date date);

//    Request for a Date of your choice
    @PutMapping(value = "dates/{dateId}")
    Date requestDate(@PathVariable("dateId") Long dateId, @RequestParam(name = "matchId") Long matchId, @RequestParam(name = "studentId") Long studentId);
}
