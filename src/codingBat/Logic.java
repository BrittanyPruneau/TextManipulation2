package codingBat;

public class Logic
{

	public static void main(String[] args)
	{
		System.out.println(lastDigit(23, 19, 13));
		System.out.println(lessBy10(1, 7, 11));
		System.out.println(withoutDoubles(6, 6, true));

		System.out.println("Math.max(5,5)  = " + Math.max(5, 5));

		// System.out.println(shareDigit(2, 3));
		// System.out.println("less than 20: " + less20(18));
		for (int i = 0; i < 100; i++)
		{
			System.out.println(i + "%" + "20 = " + i % 20); // GREAT LEARNING modulus operator returns the element its
															// ON if we were to
															// go in a circle.
			// System.out.println("3%4 == " + 3%4);
			System.out.println("19%20 should return 19 bc you are at the 19th of 20th position " + 19 % 20);
			Integer A = 5; 
			Integer B = 5; 
			System.out.println("compareTo : " + A.compareTo(B));
		}
	}

	/*
	 * 
	 */


	/*
	 * 
	 */
	public static int less20(int n) 
	{
	  Integer N = n; 
	  String s = N.toString(); 
	  int V = Integer.parseInt(s, s.length()-1);
	  
	 
	  return (V);    // == 8 || s.toString().charAt(s.length()-1) == 9) 
	
	}

	/*
	 * One way
	 */
	public static boolean shareDigit(int a, int b) 
	{
	  Integer A = a; 
	  Integer B = b; 
	  if(A.toString().charAt(0) == B.toString().charAt(0) || A.toString().charAt(0) == B.toString().charAt(1))
		{
			return true; 
		}
	  if(A.toString().charAt(1) == B.toString().charAt(0) || A.toString().charAt(1) == B.toString().charAt(1))
		{
			return true; 
		}
	  else
		  return false; 
	}

	/*
	 * 
	 */
	public static int withoutDoubles(int die1, int die2, boolean noDoubles)
	{
		int compute = 0;

		if (die1 == (die2) && noDoubles == true && die2 == 6)
			return (die2 + 1);
		if (die1 == (die2) && noDoubles == true)
			return (die1 + die2 + 1);
		if (die1 == (die2) && noDoubles == false)
			return (die1 + die2);
		if (!(die1 == die2))
			return die1 + die2;
		else
			return 0;
	}

	/*
	 * lessBy10
	 */
	public static boolean lessBy10(int a, int b, int c)
	{
		int[] array =
		{ a, b, c };
		for (int z : array)
		{
			if (Math.abs(z - a) > 9 || Math.abs(z - b) > 9 || Math.abs(z - c) > 9)
			{
				return true;
			}
		}
		return false;
	}

	/*
	 * This was challenging because out of bounds triggers when you have an if
	 * statement that includes the checker (if i == 0) AND the bounds on the same
	 * line, because it doesnt only check that line before it moves to the next.
	 * surprisingly. example, I had (if i == 0 && numbs[i + 1] % 10 == checker) ||
	 * (numbs[i + 2] % 10 == checker))
	 */
	public static boolean lastDigit(int a, int b, int c)
	{
		int[] numbs =
		{ a, b, c }; // length 3
		int count = 0;
		int i = 0;
		int checker = 0;
		while (count < 2 && i < numbs.length) // count < 2 and i less than 3
		{
			checker = numbs[i] % 10;
			if (i == 0)
			{
				if ((numbs[i + 1] % 10 == checker) || (numbs[i + 2] % 10 == checker))
				{
					count = 3;
				}
			}
			if (i == 1)
			{
				if ((numbs[i - 1] % 10 == checker) || (numbs[i + 1] % 10 == checker))
				{
					count = 3;
				}
			}
			if (i == 2)
			{
				if ((numbs[i - 1] % 10 == checker) || (numbs[i - 2] % 10 == checker))
				{
					count = 3;
				}
			}
			i++;
		}

		return (count > 1);
	}
}
