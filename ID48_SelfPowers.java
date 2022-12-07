package codex;
/*The series, 11 + 22 + 33 + ... + 1010 = 10405071317.
Find the last ten digits of the series, 11 + 22 + 33 + ... + 10001000.*/


import java.math.*;
public class ID48_SelfPowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		BigInteger sum = BigInteger.ZERO;
		
		for(int i=1;i<=1000;i++)
		{
			sum=sum.add(BigInteger.valueOf(i).pow(i));
			
		}
		str=sum.toString();
		str=str.substring(str.length()-10);
		System.out.println(str);
	}

}
