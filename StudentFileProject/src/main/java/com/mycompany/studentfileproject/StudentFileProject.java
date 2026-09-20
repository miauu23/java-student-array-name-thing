package com.mycompany.studentfileproject;

import java.io.*;
import java.util.*;


public class StudentFileProject {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 students");
        Student[] cpt205 = new Student[2];
        
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter student name: ");
            String name = input.nextLine();
            System.out.print("Enter student age: ");
            int age = input.nextInt();
            input.nextLine();
            cpt205[i] = new Student(name, age);
        }
        
        FileWriter file = new FileWriter("students.txt", true);
        for (Student student : cpt205) {
            file.write(student.name + " " + student.age + "\n");
        }
        file.close();
        
        File fileObj = new File("students.txt");
        System.out.println("------------------------------------------------------------------------");
        Scanner fileReader = new Scanner(fileObj);
        while (fileReader.hasNextLine()) {
            System.out.println(fileReader.nextLine());
        }
        fileReader.close();
    }
}
