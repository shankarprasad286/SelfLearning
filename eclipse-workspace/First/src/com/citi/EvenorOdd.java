package com.citi;

import java.util.Scanner;


public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the number");
		Scanner s= new Scanner(System.in);
		int j=s.nextInt();
		System.out.println("entered value is:"+j);
		if(j%2==0)
		{
			System.out.println("even number");
		}
		else {
			System.out.println("odd number");
		}
	}

}
