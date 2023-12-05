package org.example;

public class Student {
  int id;
  int roll;
  String name;

  public Student(int id, int roll, String name) {
    this.id = id;
    this.roll = roll;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Student{" +
            "id=" + id +
            ", roll=" + roll +
            ", name='" + name + '\'' +
            '}';
  }
}
