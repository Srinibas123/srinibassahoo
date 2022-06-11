package ASSIGNMENT4;
import java.util.*;
public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("input the string :");
		String a = input.nextLine();
		System.out.println("input the number of time you want print the string :");
		int n = input.nextInt();
		int i = 1;
		int x;
		String b;
		while (i<=n)
		{
			if ((i%10==1)    || (i%100==1))
			{
				b = "st";
			}
			else if ((i%10==2) ||    (i%100==2))
			{
				b = "nd";
			}
			else if ((i%10==3)  ||  (i%100==3))
			{
				b = "rd";
			}
			else 
			{
				b = "th";
			}
			System.out.println(i + b+ " " + a);
			i++;
		}
	}
}