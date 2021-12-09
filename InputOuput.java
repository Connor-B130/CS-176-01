import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOuput 
{

	public static void main(String[] args) 
	{

		Scanner in = new Scanner(System.in);
		
		String filePath = " ";
		boolean fileCorrect = false;
		PrintWriter outputFile;
		
		while(!fileCorrect)
		{
			System.out.println("Please enter the file path to open the input file for example C:\\Downloads\\lines.txt :");
			filePath = in.nextLine();
			
			try
			{
				outputFile = new PrintWriter("C:\\Users\\leonbennett\\Downloads\\outlines.txt");
				File inputFile = new File(filePath);
				Scanner fileFinder = new Scanner(inputFile);
				
				System.out.println("Path is valid. Enter the info you want saved. End program to exit and save.");
				fileCorrect = true;
				
				while (in.hasNextLine()) 
				{
					String what = in.nextLine();
					outputFile.println(what);
				}
				
				in.close();
				outputFile.close();
			}
			catch(FileNotFoundException exception)
			{
				System.out.println("File is not found, please try again.");	
			}
		}
	}
}