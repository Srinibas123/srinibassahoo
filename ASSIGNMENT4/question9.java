package ASSIGNMENT4;

public class question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum=0;
		for (i=1; i<=1000; i++ )
		{
			if (i%3==0 || i%5==0)
					sum+=i;
		}
			System.out.println("sum of multiples of 3&5 below 1000 is="+sum);
	}	
}
