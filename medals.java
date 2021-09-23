
public class medals 
{

	public static void main(String[] args) 
	{
		final int COUNTRIES = 8;
		final int MEDALS = 3;
		
		String[] countries =
			{
					"Canada",
					"Italy",
					"Germany",
					"Japan",
					"Kazakhstan",
					"Russia",
					"South Korea",
					"United States",
			};
		
		int[][] counts =
			{
					{ 0, 3, 0},
					{ 0, 0, 1},
					{ 0, 0, 1},
					{ 1, 0, 0},
					{ 0, 0, 1},
					{ 3, 1, 1},
					{ 0, 1, 0},
					{ 1, 0, 1},
			};
		
		System.out.println("      Country       Gold     Silver    Bronze     Total");
		System.out.println("---------------------------------------------------------");
	
		for  (int i = 0; i < countries.length; i++)
		{
			System.out.printf("%13s", countries[i]);
			
			int total = 0;
			for (int h = 0; h <counts[0].length; h++)
			{
				System.out.printf("%10d", counts[i][h]);
				total += counts[i][h];
			}
			System.out.printf("%10d", total);
			System.out.println();
		}	
		
	}

}