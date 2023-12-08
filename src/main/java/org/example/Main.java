package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
  public static void main(String[] args) {

    List<Student> studentList = new ArrayList<>();
    Object[] studentArray = new Student[100];
    int[] a = new int[100];
    a[0] = 1;
    a[1] = 2;

    Student student1 = new Student(1, 101, "Samin");
    Student student2 = new Student(2, 102, "Rahim");
    Student student3 = new Student(3, 103, "Karim");
    studentList.add(student1);
    studentList.add(student2);
    System.out.println(studentList.remove(student2));
    studentList.add(student3);
    System.out.println(studentList.indexOf(student3));
    System.out.println(studentList.get(1));
//    Iterator<Student> iterator = studentList.iterator();
//    while (iterator.hasNext()){
//
//    }

    studentArray =  studentList.toArray();
    System.out.println(studentList.size());
    System.out.println(a.length);
    System.out.println(studentList.isEmpty());
    System.out.println(studentArray.length);

    List<Student> studentList2 = new ArrayList<>();
    studentList.add(new Student(10, 201, "Abir"));
    studentList.add(new Student(11, 202, "Siam"));

    studentList.addAll(studentList2);
    System.out.println(studentList);

    List<Student> list = new ArrayList<>(); //
    List<Student> vector = new Vector<>(); // thread safe
    List<Student> linkedList = new LinkedList<>(); // doubly linked list

    linkedList.add(new Student(33, 333, "Amir"));

    Stack<Integer> stack = new Stack<>();
    stack.push(1); // 1
    stack.push(2); // 1, 2
    stack.push(4); // 1, 2, 4
    System.out.println("Element popped : " + stack.pop());; // 1, 2
    System.out.println("Element peeked : " + stack.peek());
    System.out.println(stack);
    System.out.println(stack.size());
    System.out.println(stack.empty());

  // Homework
  // Parenthesis matching
  // {()} - valid, [{}()] - valid, [{()(})] - invalid
  // Third case - Stack : [{(
    Stack<Character> characters = new Stack<>();

  }
}