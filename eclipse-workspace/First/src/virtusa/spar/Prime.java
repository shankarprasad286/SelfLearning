package virtusa.spar;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int count=0;
		System.out.println("enter the number");	
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		
		for(int j=1;j<=i;j++)
			{
				int m=i%j;
				if(m==0)
				{
					count++;
				}
			}
		if(count==2)
		{
			System.out.println(i+"is a prime number");
		}
		else
		{
			System.out.println(i+"not a prime number");
		}
	}
	
	}

	

