package codex;
/*n! means n × (n − 1) × ... × 3 × 2 × 1
For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
Find the sum of the digits in the number 100!*/


import java.math.*;
public class ID20_FactorialDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		BigInteger product=BigInteger.ONE;
		while (n!=0)
		{
			product=product.multiply(BigInteger.valueOf(n));
			n--;
		}
		BigInteger sum = BigInteger.valueOf(0);
		BigInteger modulo = BigInteger.valueOf(0);
		while (!product.equals(BigInteger.ZERO)) {
			modulo=product.mod(BigInteger.valueOf(10));
			sum=sum.add(modulo);
			product=product.divide(BigInteger.valueOf(10));
		}
		System.out.println(sum);
	}

}
