package org.example;
import java.lang.annotation.Annotation;

public class RunTime {

    public static void main(String[] args) {

        Student student = new Student(1, "Petr");
        student.getStudentDetails();

        Annotation studentAnnotation = student
                .getClass()
                .getAnnotation(AnnotationExample.class);
        AnnotationExample annotationExample = (AnnotationExample)studentAnnotation;

        System.out.println("Student Name: " + annotationExample.city());
        System.out.println("Student Age: " + annotationExample.age());
    }
}