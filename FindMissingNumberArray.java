
public class FindMissingNumberArray 
{
	public static int sumOfNnumber(int num)
	{
		num=(num*(num+1))/2;
		return num;
	}
	public static void main(String...args)
	{
		int[] a= {1,3,5,4,2};
		
		int countElement=6;
		int result=sumOfNnumber(countElement);
		System.out.println(result);
		int getSum=0;
		for(int element:a)
		{
			getSum+=element;
			
		}
		System.out.println(getSum);
		System.out.println("Missing number: "+(result-getSum));
	}

}
