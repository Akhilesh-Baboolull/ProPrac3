import java.util.Scanner; //importing package to allow keyboard input
import java.text.DecimalFormat; //importing package to round off the result

public class Qu_Litres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner myInput = new Scanner(System.in); //creating identifier for keyboard input
		DecimalFormat df2 = new DecimalFormat(".##");
		
		double pints;
		double litres;
		int choice;
		
		do {
		
		System.out.println("Volume Conversion Pints To Litres"); //title
		
		System.out.println(""); //leaving a line
		
		do {
		System.out.print("Enter volume in pints to be converted: "); //Prompt message for user to input
		pints = myInput.nextDouble(); ///allowing user input
		
		if(pints <= 0) { //validating input
			System.out.println("Invalid value entered! Please Re-enter..."); //Error message upon wrong input
			
		}
		
		
		}while(pints <= 0); //allowing user to re-enter
		
		litres = pints / 2.2; //converting pints to litres
		
		System.out.println(pints + " pints converted to litres is " + df2.format(litres) + " litres"); //Displaying the result
				
		do {
		System.out.println("");
		//Menu to display options to the user if he/she wants to try again
		System.out.println("Choose 1 to Re-try..");
		System.out.println("Choose 2 to Exit the program!");
		System.out.print("Enter choice: ");
		choice = myInput.nextInt();
		
		if(choice < 1 && choice > 2) {
			//validating choice entered
			System.out.print("Invalid Choice entered! Please choose from the above menu.."); //error message
		}
		
		}while(choice < 1 && choice > 2); //allowing user to re-enter
		
		if(choice == 2) { 
			System.out.print("You are about to exit the program..."); //prompting user to exit the program
		}
		
		}while(choice == 1);
		
		myInput.close();
	}

}
