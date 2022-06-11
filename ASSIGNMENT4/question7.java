package ASSIGNMENT4;

public class question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		double r,s = 0,avg = 0;
		n = Integer.parseInt(args[0]);
		for (i=1; i<=n; i++)
		{
			r = Math.random();
			System.out.println("Random no." +i+ "=" +r);
			s+=r;
		}
			System.out.println("sum of the random number=" +s);
			avg=s/n;
			System.out.println("average =" +avg);
}
}
