package com.java.stream.revision.intermediateoperations;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Student{

    int id;
    String name;

    public Student(int id, String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(name, student.name);
    }

    public int hashCode(){
        return Objects.hash(id,name);
    }

}

public class Distinct_CustomObject {

    public static void main(String[] args) {

        List<Student> list = Arrays.asList(
                new Student(1, "Vishal"),
                new Student(2, "Gokul"),
                new Student(1, "Vishal")   // Duplicate
        );

        List<Student> distinctList = list.stream()
                .distinct()
                .collect(Collectors.toList());

        distinctList.forEach(System.out::println);

    }
}
