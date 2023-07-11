import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElementsArray {
	public static void main(String... args) {
		int[] array = { 12, 23, 12, 23 };

		findDupBruteForce(array);
		 sortingDup(array);
		HashSetDup(array);
		hashMapDup(array);
		findDupJava8(array);
	}

	public static void findDupBruteForce(int[] a) {
		for (int index = 0; index < a.length; index++) {
			for (int sec = index + 1; sec < a.length; sec++) {
				if (a[index] == a[sec]) {
					System.out.println("DUPLICATE: " + a[index]);
				}
			}
		}
	}

	public static void sortingDup(int[] a) {
		Arrays.sort(a);
		for (int index = 0; index < a.length - 1; index++) {
			if (a[index] == a[index + 1]) {
				System.out.println("DUPLICATE: " + a[index]);
			}
		}
	}
	// 1, 2, 23, 12, 23 
	public static void HashSetDup(int[] a) {
		HashSet<Integer> set = new HashSet<Integer>();

		for (int element : a) {
			if (!set.add(element)) {
				System.out.println(set.add(element));
				System.out.println("DUPLICATE: " + element);
			}
			else
			{
				System.out.println("else");
			}
		}
	}
	public static void hashMapDup(int[] array)
	{
		 HashMap<Integer,Integer> map=new HashMap<>();
		 for(int element: array)
		 {
			 // 12 23 1 23 
			 if(map.get(element)==null)//
			 {
				 map.put(element, 1);//12,1  23,1  1,1
			 }
			 else
				 map.put(element, map.get(element)+1);//23,2
		 }
		 Set<Entry<Integer,Integer>> entryset=map.entrySet();
		 for(Entry<Integer,Integer> entry:entryset)
		 {
			 if(entry.getValue()>1)
				 System.out.println("Duplicate elements: "+entry.getKey()+" found "+entry.getValue()+" times");
		 }
		 
	}
	private static void findDupJava8(int[] a)
	{
		Set<Integer> unique=new HashSet<Integer>();
		Set<Integer> duplicate=Arrays.stream(a)
				               .filter(value->!unique.add(value))
				               .boxed()
				               .collect(Collectors.toSet());
		
		System.out.println(duplicate);
	}
}









