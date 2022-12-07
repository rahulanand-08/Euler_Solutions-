package codex;
/*2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
What is the sum of the digits of the number 2^1000?*/
import java.math.*;
public class ID16_PowerDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger result=BigInteger.TWO.pow(1000);
		String str=result.toString();
		int sum=0;
		for (int i=0;i<str.length();i++)
		{
			sum=sum+str.charAt(i);
		}
		System.out.println(sum);
	}
}
