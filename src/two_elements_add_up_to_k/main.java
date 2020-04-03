package two_elements_add_up_to_k;

import java.util.HashSet;

/* Problem Two elements add up to K
 * This problem was recently asked by Google. Given a list of numbers and a number k,
 * return whether any two numbers from the list add up to k. 
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17. 
 * 
 * Bonus: Can you do this in one pass?
 * 
 * Complexity:
 * Time: O(N) (Hashset.contains = O(1))
 * Space: O(N)
*/

public class Main {

	public static void main(String[] args) 
	{
		int[] array = {10,5,3,7};
		System.out.println(addUpTok(10, array));
	}
	
	public static boolean addUpTok(int k, int[] array) 
	{
		HashSet<Integer> existingElements = new HashSet<Integer>();
		
		
		for (int element : array) 
		{
			if(existingElements.contains(k - element)) 
			{
				return true;
			}else 
			{
				if(existingElements.contains(k - element)) 
				{
					return true;
				}
				existingElements.add(element);
			}
		}
		
		return false;
	}

}
