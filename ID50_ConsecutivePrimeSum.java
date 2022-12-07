package codex;
/*The prime 41, can be written as the sum of six consecutive primes:
41 = 2 + 3 + 5 + 7 + 11 + 13
This is the longest sum of consecutive primes that adds to a prime below one-hundred.
The longest sum of consecutive primes below one-thousand that adds to a prime, contains 21 terms, and is equal to 953.
Which prime, below one-million, can be written as the sum of the most consecutive primes?*/

public class ID50_ConsecutivePrimeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,sum2=0,nfac,count=0;
		for(int i=1;i>0;i++)
		{
			nfac=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0) 
				{
					nfac++;
				}
			}
			if(nfac==2)
			{
				sum=sum+i;
				if(sum>=1000000)
				{
					break;
				}
				count++;
				sum2=sum;
			}
		}
		System.out.println(sum2);
	}

}
