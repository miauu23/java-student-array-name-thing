/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentfileproject;
import java.io.*;
import java.util.*;
/**
 *
 * @author raahil.muumin
 */
public class StudentFileProject {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter student age: ");
        int age = input.nextInt();

        students.add(new Student(name, age));

        FileWriter file = new FileWriter("students.txt", true);

        for (Student student : students) {
            file.write(student.name + " " + student.age + "\n");
        }

        file.close();

        System.out.println("Student saved.");
    }
}