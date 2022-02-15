package de.neuefische.studentenliste;

import java.util.UUID;

public class Student {
    private String id;
    private String name;

    public Student() {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
