package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
  public static void main(String[] args) {

    List<Student> students = new ArrayList<>();
    Object[] studentArray = new Student[100];
    int[] a = new int[100];
    a[0] = 1;
    a[1] = 2;

    Student student1 = new Student(1, 101, "Samin");
    Student student2 = new Student(2, 102, "Rahim");
    Student student3 = new Student(3, 103, "Karim");
    students.add(student1);
    students.add(student2);
    System.out.println(students.remove(student2));
    students.add(student3);
    System.out.println(students.indexOf(student3));
    System.out.println(students.get(1));
//    Iterator<Student> iterator = students.iterator();
//    while (iterator.hasNext()){
//
//    }

    studentArray =  students.toArray();
    System.out.println(students.size());
    System.out.println(a.length);
    System.out.println(students.isEmpty());
    System.out.println(studentArray.length);
  }
}