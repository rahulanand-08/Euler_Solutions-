package codex;

public class ID6_SumSquareDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		int result=(n*(n+1))/2;
		result=(int) Math.pow(result, 2);
		int result2=0;
		while (n!=0)
		{
			result2=(int) (result2+Math.pow(n, 2));
			n--;
		}
		System.out.println(result-result2);
	}

}
