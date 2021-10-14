import java.util.Scanner;
import java.util.ArrayList;

public class ColorSearch 
{

	public void colorSearch(ArrayList<String> allColors, String color)
	{
		
		boolean found = true;
		for (String entity : allColors)
		{
			if (color.equals(entity))
			{
				found = true;
				break;
			}
		}
		if (found == true)
		{
			System.out.println("The color " + color + " was found after " + (allColors.indexOf(color) + 1) + " searches.");
			System.out.println();
		}
		else if (found = false)
		{
			System.out.println("The color " + color + " was not found after " + allColors.size() + " searches.");
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{

		Scanner in = new Scanner(System.in);
		
		ColorSearch searchForColor = new ColorSearch();
		
		ArrayList<String> arrayColor = new ArrayList<String>();
		
		String color;
		
		
		System.out.println("Please enter a color name, or type in 'Q' to quit: ");
		
		while(in.hasNext())
		{
			color = in.nextLine();
			if(color.equals("Q"))
			{
				break;
			}
			else
			{
				arrayColor.add(color);
			}
			
			System.out.println("Please enter a color name or type 'Q' to quit: ");
			
		}
		
		System.out.println();
		System.out.println("Enter a color to search for or type 'Q' to quit: ");
		
		String colorSearch;
		
		while(in.hasNext())
		{
			colorSearch = in.nextLine();
			if(colorSearch.equals("Q"))
			{
				break;
			}
			else
			{
				searchForColor.colorSearch(arrayColor, colorSearch);
			}
			System.out.println("Enter a color to search for or type 'Q' to quit: ");
		}
		
	}
	
}