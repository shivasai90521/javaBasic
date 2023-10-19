package com.assigementsexample;

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*
		 * Demo d=new Demo(); for(int i=1;i<=4;i++) {
		 * System.out.println("Please enter number: "); int num=sc.nextInt();
		 * d.PositiveOrNegitive(num); System.out.println("---------------------"); }
		 */
		Demo1 d=new Demo1();
			for(int i=1;i<=5;i++) {
				System.out.println("pleae enter  number: ");
				int num=sc.nextInt();
				d.CheckOddOrEven(num);
				System.out.println("----------------");
			}
			sc.close();
		}
	}	