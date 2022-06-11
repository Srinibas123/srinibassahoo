package ASSIGNMENT4;

import java.util.Scanner;

public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("count from :");
		int a = input.nextInt();
		System.out.println("count to :");
		int b = input.nextInt();
		System.out.println("count by :");
		int c = input.nextInt();
		for (a=4 ; a<=c ;)
		{
			System.out.println(a + "");
			a = a + b;
		}
	}
}

