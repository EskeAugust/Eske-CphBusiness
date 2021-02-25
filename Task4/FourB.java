import java.util.Arrays;

public class FourB	
{
	public static void main(String[] args)
	{
		String[] stringArray = {"Jayas", "Og", "Tiril"};
		System.out.println(myString(stringArray));
		
	}	

	public static String myString(String[] arr)
	{
		String aString = "";
		for (int i = 0; i < arr.length; i++)
		{
			aString +=" " + arr[i];
		}
		return aString;
	}

}