package com.assigementsexample;

import java.util.Scanner;

public class StudtentDetails {
	String name;
	int id;
	String course;
	String dept;
	long phno;
	String address;
	double fees;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StudtentDetails st=new StudtentDetails();
		System.out.println("Enter student details !!!!!!");
		System.out.println("Enter student id: ");
		int i= sc.nextInt();
		System.out.println("Enter student name: ");
		String s=sc.next();
		System.out.println("Enter student course: ");
		String str=sc.next();
		System.out.println("Enter student dept: ");
		String s1=sc.next();
		System.out.println("Enter student phno :");
		long l=sc.nextLong();
		System.out.println("Enter student address: ");
		String s2=sc.next();
		System.out.println("Enter student fees: ");
		double d=sc.nextDouble();
		System.out.println("------------naku vastunayi neku enduku error vastundi---------------");
		System.out.println("the end");
	}
}
