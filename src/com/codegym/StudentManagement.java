package com.codegym;

import java.util.ArrayList;
import java.util.List;

//C1
public class StudentManagement {
    private static final StudentManagement INSTANCE = new StudentManagement();
    private List<String> students = new ArrayList<>();

    private StudentManagement() {
    }

    public static StudentManagement getInstance() {
        return INSTANCE;
    }
}
