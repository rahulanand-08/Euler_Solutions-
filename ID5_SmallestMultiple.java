package codex;
/*2520 is the smallest number that can be divided by each of the numbers from 1 to 10 
without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?*/


public class ID5_SmallestMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
        for (int i = 1; i < Integer.MAX_VALUE; i++) 
        {
            if (i % 20 == 0 && i % 19 == 0 && i % 18 == 0 && i % 17 == 0
                    && i % 16 == 0 && i % 14 == 0 && i % 13 == 0
                    && i % 11 == 0) 
            {
                num = i;
                break;
            }
        }
        System.out.println(num);
	}

}
