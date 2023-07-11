import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates 
{
	public static void main(String...args)
	{
		int[] array= {1,2,2,3,4,5,4};
		
		int[] result=afterRemoveDuplicate(array);
		
		System.out.println(Arrays.toString(result));
		
	}
	public static int[] afterRemoveDuplicate(int[] array)
	{
		
		Set<Integer> set=new HashSet<Integer>();
		
		
		for(int element: array)
		{
			set.add(element);
		}
		int[] result=new int[set.size()];
		int index=0;
		
		for(int element:set)
		{
			result[index]=element;
			index++;
		}
		return result;
		
	}

}
