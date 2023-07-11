import java.util.Arrays;

public class TwoUnsortedArraySingleSortedArray 
{
	public static void main(String...args)
	{
		int[] a1= {3,6,8,1,4};
		int[] a2= {10,2,7,5,9};
	
		int[] result=mergeSortTwoArray(a1,a2);
		System.out.println(Arrays.toString(result));
		
	}
	public static int[] mergeSortTwoArray(int[] a,int[] b)
	{
		int length1=a.length;int length2=b.length;
		int totalLength=length1+length2;
		int[] merge=new int[totalLength];
		
		for(int index=0;index<length1;index++)
		{
			merge[index]=a[index];
		}
		for(int index=0;index<length2;index++) {
			merge[length1+index]=b[index];
		}
		return merge;

	
		
//		System.arraycopy(a, 0, merge, 0, length1);
//		System.out.println(Arrays.toString(merge));
//		System.arraycopy(b, 0, merge, length1, length2);
//		//10 2 7 5 9   10 
//		// 5,5
//		System.out.println(Arrays.toString(merge));
//		Arrays.sort(merge);
//		return merge;
		
		
	}

}
