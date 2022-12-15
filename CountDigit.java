package com.test;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		int count=0;
		int num;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any digit:");
		num=sc.nextInt();
		
		if(num>0) {
			while(num>0) {
				num=num/10;
				count++;
			}
		}
		else {
			System.out.println("Invalid Input:");
		}
		
		System.out.println("There are "+count+" digits in the number");
		

	}

}
