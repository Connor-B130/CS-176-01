
public class arrayAssignment1 
{

	public static void main(String[] args) 
	{
		double[] values = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
		
		// Printing all elements of an array in a single row, separated by spaces
		
		for(double element : values)
		{
			System.out.print(element + " ");
		}
		System.out.println();
		System.out.println();
		
		// Computing and printing the maximum of all elements in an array
		double max = 0;
		double num = 0;
		
		for(double element : values)
		{
			if(element > num)
			{
				max = element;
			}
			num = element;
		}
		System.out.println(max);
		System.out.println();
		
		
		// Computing and printing a count of elements in the array that are negative
		int count = 0;
		
		for(double element : values)
		{
			if (element < 0)
			{
				count += 1;
			}
		}
		System.out.print(count);
		
	}

}
