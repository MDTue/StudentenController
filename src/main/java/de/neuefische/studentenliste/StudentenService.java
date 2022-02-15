package de.neuefische.studentenliste;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class StudentenService {
    private List<Student> studenten = new ArrayList<>();

    public void addStudenten(Student neuerStudent) {
        studenten.add(neuerStudent);

    }

    public List<Student> getStudenten() {
        return studenten;
    }

}

