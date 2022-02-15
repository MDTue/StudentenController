package de.neuefische.studentenliste;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")

public class StudentenController {
    private StudentenService studentenService;

    public StudentenController(StudentenService studentenService) {
        this.studentenService = studentenService;
    }
    @PostMapping
    public void addStudentsToList(@RequestBody Student student){
        studentenService.addStudenten(student);
    }
    @GetMapping
    public List<Student> getStudentList() {
        return studentenService.getStudenten();
    }



}
