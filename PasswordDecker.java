//Import Scanner Utility
import java.util.Scanner;

public class PasswordDecker 
{
   public static boolean checkPassword(String password)
   {
      if(size(password) && letDigit(password) && digits(password) && upperChars(password) && lowerChars(password))
         return true;
      return false;
    }

   public static boolean size(String password)
   {
       return (password.length() >= 9);
  
   }

   public static boolean letDigit(String password)
   {  
      for (int i = 0; i < password.length(); i++)
      {
         if(!((password.charAt(i)>47 && password.charAt(i)<58)||(password.charAt(i)>64 && password.charAt(i)<91)||(password.charAt(i)>96 && password.charAt(i)<123)))
            return false;
      }
      return true;
  
    }
                   
	public static boolean digits(String password)
   {
     // return (ch >= '0' && ch <= '9');
         
      int digCount = 0;
      for (int i = 0; i < password.length(); i++) 
      {
         if (password.charAt(i) > 47 && password.charAt(i) < 58)
            digCount += 1;
      }
       
       return (digCount >=3);
         //return true;
       //return false;
   
     } 
                 
   public static boolean upperChars(String password)
   {
      
      //return (ch >='A' && ch <= 'Z');
            
      int upperCount = 0;
      for (int i = 0; i < password.length(); i++) 
      {
         if (password.charAt(i) > 64 && password.charAt(i) < 91)
            upperCount = upperCount + 1;
        
       }
         return (upperCount >=3);
         //return true;
       //return false;
   }
           
  public static boolean lowerChars(String password)
   {
      //return (ch >='a' && ch <= 'z');
      
      int lowerCount = 0;
      for (int i = 0; i < password.length(); i++) 
      {
         if (password.charAt(i) > 96 && password.charAt(i) < 123)
            lowerCount = lowerCount + 1;
        
       }
       if (lowerCount >=3)
         return true;
       return false;

    }
       
    
   public static void main(String[] args)
	{
      Scanner input = new Scanner(System.in);
      String answer = "";
      String password = "";    
      do
        {
           //System.out.print("Enter a password:"+"\t");
          
            //int digCount = 0;
            //int upperCount = 0;
           // int lowerCount = 0;
            //String password = " ";
            //String answer = " ";

            do
            {
			       //Read Input
               
                System.out.print("Enter a password:"+"\t");
 		   	    password =  input.nextLine();
                System.out.println("Entered password:" + "\t" + password);
                if(checkPassword(password))
                   System.out.println("Judgement:" + "\t" + "Valid Password");
               else
                  System.out.println("Judgement:" + "\t" + "Invalid Password");

                  System.out.print("Retry? (Y/N): ");
                  //input.nextLine();
                  answer = input.nextLine();	
            }
             while(!answer .equals("N"));
            
        }
      
         while(!answer .equals("N"));
            System.out.print("Program Terminated");    
              
   }

}
      
     