package com.codegym;

public class Main {

    public static void main(String[] args) {
        StudentManagement studentManagement = StudentManagement.getInstance();
        ClazzManagement clazzManagement = ClazzManagement.getInstance();
        clazzManagement.add("3");
        clazzManagement.add("2");
        clazzManagement.showAll();
        ClazzManagement clazzManagement1 = ClazzManagement.getInstance();
        clazzManagement1.showAll();
    }
}
