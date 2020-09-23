package com.Kerol9995;

public class Main {

    public static void main(String[] args) {
        Student [] students = StudentAction.ArrayCreator();
        StudentAction.StudentOfFaculty(students,Faculty.History.ordinal());
        StudentAction.ViewerFaculty(students);
        StudentAction.ViewerCourse(students);
        StudentAction.ViewerYear(students, 1995);
        StudentAction.ViewerGroup(students,11);
    }
}
