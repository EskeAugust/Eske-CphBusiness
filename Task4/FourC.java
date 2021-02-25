import java.util.Arrays;
import java.util.stream.*;

public class FourC
{
	public static void main(String[] args)
	{
		int[] intArray = {3,4,6};
		System.out.println(sumArray(intArray));
		
	}	

	public static int sumArray(int[] arr)
	{
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
		{
			sum = sum + arr[i];
		}
		return sum;
	}
}