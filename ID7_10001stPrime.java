package codex;
/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?*/

public class ID7_10001stPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i=2;i>0;i++)
		{
			int c=0;
			for (int j=2;j<=i;j++)
			{
				if (i%j==0)
					c++;
			}
			if (c==1)
				count++;
			if(count==10001)
			{
				System.out.println(i);
			break;
			}
		}
	}

}
