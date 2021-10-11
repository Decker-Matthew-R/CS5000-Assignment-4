
public class PatternDecker 
{

	public static void main(String[] args)
	{
		//Defines the variable row which will be our number of rows
		int row = 6;
		//For Loop for spaces in pattern
		for (int i = row; i >= 1; i--)
		{
			for (int j = row; j>i; j--)
			{
				System.out.print(" ");
			}
		//For loop for number in sequence	
		for (int k = 1; k <=i; k++)
		{
			
			System.out.print(k);
		}
		
		//Skips final line in program
		System.out.println("");
		}
	}
	
}

	