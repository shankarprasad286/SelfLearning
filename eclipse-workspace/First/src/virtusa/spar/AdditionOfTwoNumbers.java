package virtusa.spar;

import java.util.Scanner;

public class AdditionOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i,j,k;
    System.out.println("Enter the two numbers to add");
    Scanner s= new Scanner(System.in);
    i=s.nextInt();
    j=s.nextInt();
    k=i+j;
    System.out.println("Addition of two numbers are:"+k);

	}

}
