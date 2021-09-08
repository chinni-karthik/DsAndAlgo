package com.ck.interview.questions.immutable;

class StudentDeep implements Cloneable {
    int id;
    String name;
    Course course;

    public StudentDeep(int id, String name, CourseDeep course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    //Overriding clone() method to create a deep copy of an object.
    protected Object clone() throws CloneNotSupportedException {
        StudentDeep student = (StudentDeep) super.clone();
        student.course = (CourseDeep) course.clone();
        return student;
    }
}