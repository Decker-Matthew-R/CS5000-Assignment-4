import java.util.Scanner;
 

public class InputSumDecker 
{
    // Main method 
    public static void main(String[] args)
    {
        // Create a Scanner and initialize variables
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int num= 0;
        String answer = "";
        String numbers = ""; 
   
        do
        {
           System.out.print("Enter positive integers (-1 to quit): ");
            sum = 0;
            numbers = "";

            do
            {
			       //Read Input
 		   	     num =  input.nextInt();
            
		   	     if(num > -1)
                 {
                   numbers = numbers + ", " + num;
                   sum = sum + num;
                 }
            }
		   	   
		      while(num != -1);
                  System.out.println("Entered Numbers: " + numbers.substring(1,numbers.length()));
                  System.out.println("The sum: " + sum);
            	
                  System.out.print("Retry? (Y/N): ");
                  input.nextLine();
                  answer = input.nextLine();	
            
          }
         while (!answer.equals("N")); 
        System.out.println("Program Terminated");
   }
}

