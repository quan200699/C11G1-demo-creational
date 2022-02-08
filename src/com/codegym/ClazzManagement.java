package com.codegym;

import java.util.ArrayList;
import java.util.List;

public class ClazzManagement {
    private static ClazzManagement clazzManagement;
    private List<String> clazzes = new ArrayList<>();

    private ClazzManagement() {
    }

    public static ClazzManagement getInstance() {
        if (clazzManagement == null) {
            clazzManagement = new ClazzManagement();
        }
        return clazzManagement;
    }

    public void showAll() {
        for (String clazz : clazzes) {
            System.out.println(clazz);
        }
    }

    public void add(String name) {
        clazzes.add(name);
    }
}
