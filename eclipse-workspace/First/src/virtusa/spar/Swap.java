package virtusa.spar;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j;
		int k=0;
		
		System.out.println("enter the i value");
		Scanner s=new Scanner(System.in);
		i=s.nextInt();
		System.out.println("enter the j value");
		j=s.nextInt();
		
		k=i;
		i=j;
		j=k;
		
		
		
		System.out.println(i);
		System.out.println(j);
	}

}
