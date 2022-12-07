package codex;
/*A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.*/


public class ID4_LargestPalindromeProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[1000];
		int c=0;
		for(int i =999; i>100; i--){
	        for(int j = 999; j>100; j--){
	            int prd= j*i;
	            if(isPalindrome(prd))
	            {
	                array[c]=i*j;
	                c++;
	                break;
	            }
	        }
	    }
		int max=Integer.MIN_VALUE;
		for (int i=0;i<1000;i++)
		{
			if (array[i]>max)
				max=array[i];
		}
		System.out.println(max);
	}
	static boolean isPalindrome(int a) 
	{
		int rev=a;
		int rem=0,sum=0;
		while(rev!=0)
		{
			rem=rev%10;
			sum=sum*10+rem;
			rev=rev/10;
		}
		if (a==sum)
			return true;
		return false;
	}

}
