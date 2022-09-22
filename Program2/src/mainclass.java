// Application  Example 1
// Name 		Brandon Weber
// Github user	BrandonWeber
// date 		Sep 19, 2022
// version  	1
// description 	Program 2 - switch statements and if/else.


//import scanner
import java.util.Scanner ; 

public class mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initialize scanner
				Scanner keyboard = new Scanner (System.in);
				
				// Get number data
				System.out.println("What is your favorite number? ");
				int Num1 = keyboard.nextInt (); 
				
				System.out.println("What is your second favorite number? "); 
				int Num2 = keyboard.nextInt ();
				
				System.out.println("What is your third favorite number? ");
				int Num3 = keyboard.nextInt ();
				
				// main menu
				System.out.println("Main Menu - Operations ");
				System.out.println("\t1.) Add ");
				System.out.println("\t2.) Subtract");
				System.out.println("\t3.) Divide ");
				System.out.println("\t4.) Multiply");
				System.out.print("What operation is your favorite? ");
			
				int menuChoice = keyboard.nextInt();
				int Num5 = 270231;
				
				//switch statement
				switch (menuChoice) {
				case 1:
					System.out.println("Your numbers added together are " + (Num1 + Num2));
					
					if ((Num1 + Num2) > Num3 )
						System.out.println("Your numbers added are greater than your third number");
					else 
						System.out.println("Your numbers added are less than your third number");
					
					break;
				
				case 2:
					System.out.println("Your numbers subtracted are "+ (Num1 - Num2));
					
					if ((Num1 + Num2) > Num3 )
						System.out.println("Your numbers subtracted are greater than the your third number");
					else 
						System.out.println("Your numbers subtracted are less than your third number");
					
					break;
					
				case 3:
					System.out.println("Your numbers divided are " + (Num1 / Num2));
					
					if ((Num1 + Num2) > Num3 )
						System.out.println("Your numbers divided are greater than your third number");
					else 
						System.out.println("Your numbers divided are less than your third number");
					
					break;
			
				case 4:
					System.out.println("Your numbers multiplied are " + (Num1 * Num2));
					
					if ((Num1 + Num2) > Num3 )
						System.out.println("Your numbers multiplied are greater than your third number");
					else 
						System.out.println("Your numbers multiplied are less than your third number");
					
					break;

				
	}

}
	
}
