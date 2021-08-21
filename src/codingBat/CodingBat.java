package codingBat;
/**
 * 
 * @author Brittany Pruneau
 * 
 * Coding bat challenge wordEnds.
 * Given a string and a non-empty word string, return a string made of each char just before and 
 * just after every appearance of the word in the string. Ignore cases where there is no char before 
 * or after the word, and a char may be included twice if it is between two words.
 *
 */
public class CodingBat 
{
	/**
	 * 
	 * @param str	Takes in a string which we will be looping through to see if it has an instance of the string word. 
	 * @param word	Used to check if there is a match in the string str, if there is we want to save and print the 
	 * 				character before and after the string.
	 * @return		Returns a string of the characters before and after an occurrence of the string word in the string str. 
	 */
	public String wordEnds(String str, String word) 
	{
		StringBuilder wordEnds = new StringBuilder();
		int i = 0;
		if (str.equals(word)) 
		{
			return "";
		}

		if (word.length() == 1) 
		{
			for (i = 0; i < str.length() - 1; i++) 
			{
				if (str.charAt(i) == word.charAt(0) && i == 0) 
				{
					wordEnds.append(str.charAt(i + 1));
				} 
				else if (str.charAt(i) == word.charAt(0) && i > 0 && i < str.length()) 
				{
					wordEnds.append(str.charAt(i - 1)).append(str.charAt(i + 1));
				} 
				else if (i == str.length() && i != word.charAt(0)) 
				{
					return wordEnds.toString();
				}
				else
					return wordEnds.toString();
			}
		}

		if (word.length() > 1) 
		{
			for (i = 0; i < str.length(); i++) 
			{
				if (str.charAt(i) == word.charAt(0)) 										
				{
					int count = 0;
					while (i < str.length() && count < word.length())
					{
						if (str.charAt(i) != word.charAt(count)) 
						{
							break;
						}
						i++; 
						count++;
					}

					if (count == i) 
					{
						int temp = str.length() - count;
						wordEnds.append(str.charAt(str.length() - temp));
						i = i - 1;
					}
					if (i == str.length() && count == word.length()) // this one is for end of the
					{
						// print the index i that is
						int charBeforeEnd = (str.length() - 1) - word.length();
						wordEnds.append(str.charAt(charBeforeEnd));
					}
				}
			}
		}
		return wordEnds.toString();
	}
}