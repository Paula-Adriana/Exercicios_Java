package br.com.udemy.student;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.println("Enter the student data: ");
		System.out.print("Name: ");
		student.name = sc.next();
		
		System.out.print("Grade one: ");
		student.grade01 = sc.nextDouble();
		
		System.out.print("Grade two: ");
		student.grade02 = sc.nextDouble();
		
		System.out.print("Grade three: ");
		student.grade03 = sc.nextDouble();
		
		System.out.println(student);
		
		sc.close();
	}
}
