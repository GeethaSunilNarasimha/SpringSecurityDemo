package com.geetha.SpringSecurity.studentcontroller;

import com.geetha.SpringSecurity.entities.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    private List<Student> students = new ArrayList<>(List.of(
            new Student(1, "Anvay", "Kindergarten", 98),
            new Student(2, "Sunil", "Basic Math", 78)
    ));

    @GetMapping("/students")
    private List<Student> getStudents(){
        return students;
    }
}
