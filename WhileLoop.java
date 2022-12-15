package com.test;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		int FirstNum,SecondNum;
		int EvenSum=0,OddSum=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two positive numbers:(Note:first num is lesser than second number)");
		FirstNum=sc.nextInt();
		SecondNum=sc.nextInt();
		
		if(FirstNum<SecondNum) {
			for(int i=FirstNum; i<=SecondNum;i++) {
				
				if(i%2==0) {
					System.out.print(i+", ");
					
					EvenSum=EvenSum+i;
				}
			
			
			}
		}
		System.out.println("Sum of Even numbers from "+FirstNum+" to "+SecondNum+" is: "+EvenSum);
		
		for(int i=FirstNum; i<=SecondNum;i++) {
			
			if(i%2!=0) {
				System.out.print(i+", ");
				
				OddSum=OddSum+i;
			}
		}
		System.out.println("Sum of Odd numbers from "+FirstNum+" to "+SecondNum+" is: "+OddSum);
		

	}

}
