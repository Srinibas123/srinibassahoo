package ASSIGNMENT4;
import java.util.*;
public class question14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		double s=0, res = 0;
		System.out.println("Enter the value of n");
		n = input.nextInt();
		int x = 0;
		int v = 1;
		while (v<=n)
		{
			x=v;
			v=v*2;
		}
			System.out.println(x);
}
}