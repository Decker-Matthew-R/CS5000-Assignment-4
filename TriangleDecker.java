
public class TriangleDecker 
{
	//Defines the method PyramidDecker to reuse
	public static void PyramidDecker(int n)
	{
		
	//For Loop	
	for (int k = 1; k <= n; ++k) 
	{
		//Spacing Variable
        int spaces = n-k;
        //Determines the number of ** to place on each row
        int asterisk = (k-1)*2+1;
        
        //Nested for loop for spacing
        for (int j = 1; j <= spaces; ++j) 
        {
            System.out.print(' ');
        }
        
        //For Loop for **
        for (int j = 1; j <= asterisk; ++j) 
        {
            System.out.print('*');
        }
        
        //Jumps to the next line after conditions are met
        System.out.println();
	}
	}
    
     
    //Function to Execute the Above Loop
    public static void main(String args[])
    {
    	//Number of rows in the triangle
        int n = 5;
        PyramidDecker(n);
    }
}