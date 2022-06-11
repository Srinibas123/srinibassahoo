package ASSIGNMENT4;
import java.util.*;
public class question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n,r=0,s=0;
		System.out.println("Enter the number");
		n = input.nextInt();
		int n1=n;
		while (n>0)
		{
			r=n%10;
			s+=r;
			n/=10;
			System.out.println(r+"");
		}
		if (s%9==0)
			  System.out.println(n1+ "is divisible by 9");
		else
			System.out.println(n1+ "is not divisible by 9");
}
}
