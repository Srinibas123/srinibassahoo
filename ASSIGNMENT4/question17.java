package ASSIGNMENT4;
import java.util.*;
public class question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = input.nextInt();
		for (int i=1; i<=n; i++)
		{
				for (int j=1; j<=n; j++)
				{
					if ((i%j==0)|| (j%i==0))
						System.out.println("*");
					else
						System.out.println(" ");
				}
					System.out.println(i);
}
}
}