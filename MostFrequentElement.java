import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MostFrequentElement {
	public static void main(String... args) {
		int[] a = { 1, 28,8,90,87,86,87 };

		int frequent = mostFrequent(a);

		System.out.println(frequent);
	}

	public static int mostFrequent(int[] array) {
	
	Map<Integer,Integer> map=new HashMap<>();
	int max=0;int mostElement=0;
	for(int element: array)
	{
		int frequency=map.getOrDefault(element, 0)+1;
		map.put(element, frequency);
		
		if(frequency>max)
		{
			frequency=max;
			mostElement=element;
		}
		
	}
	
	return mostElement;
	
	}

}
