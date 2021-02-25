public class FourD
{
	public static void main(String[] args)
	{
		double[] douArray = {3,4,6};
		System.out.println(avarage(douArray));
		
	}	

	public static double avarage(double[] arr)
	{
		double sum = 0.0;
		double average = 0.0;

		for (int i = 0; i < arr.length; i++)
		{
			sum = sum + arr[i];
			average = sum/arr.length;
		}
		return average;
	}
}