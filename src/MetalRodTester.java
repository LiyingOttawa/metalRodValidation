import java.util.Scanner;

/*
* Assessment: Assignment 02
* Student Name: Liying Guo
* Due Date: Jul 28, 2023
* Description: MetalRodTester Class for Assignment 02
* Professor Name: Amal Ibrahim
*/
public class MetalRodTester {
	public static void main(String[] args) {
		 /*
		 * assign String "y" to variable named shouldContinue; the purpose is to make program into the loop
		 * declare two variable countTotal&countWithinTolerance, and assign 0 to these two variables
		 * the purpose is to calculate the percentage of tolerance in the future
		 */
		String shouldContinue = "y";
		float countTotal = 0;
		float countWithinTolerance = 0;
		//instantiate metalRod object
		MetalRod metalRod = new MetalRod();
		/*  This is main Loop
		 *  In each loop, conduct the following:
		 *  1. take user input as length, 
		 *  check if the length is within tolerance
		 *  and print the report
		 *  2. take user's input as shouldContinue
		 *  to determine if staying in main loop
		 *  3. use a inner loop to make sure 
		 *  the input is float for length
		 *  4. use another inner loop to make sure
		 *  the input is "y" or "n" for shouldContinue variable
		 *  
		 */
		while(shouldContinue.equals("y") ) {
			//output message
			System.out.println("Please enter the length of the rod in cm");
			//instantiate scanner object
			Scanner keyboard = new Scanner(System.in);
			
			/* the first small loop, 
			 * to determine if the type entered by the user is not a double type
			 * then enter the loop
			 */			
			while(!keyboard.hasNextDouble()) {
				//output message
				System.out.println("Please enter a numerical value");
				// clear stream for next loop
				keyboard.next();
			}
						
			//assign user input to the variable length
			double length = keyboard.nextDouble();
			//set the length to metalRod object
			metalRod.setLength(length);
			//call work method from MetalRod class, and assign the result to the variable result
			boolean result = metalRod.rodIsWithinTolerance();
			//increment countTotal by 1
			countTotal++;
			/*use selection structure to decide which message to output, 
			 *increase countWithinTolerance if the result is true
			 */
			if(result) {
				//output message
				System.out.println("This rod is within tolerance.");
				//increment countWithinTolerance by 1
				countWithinTolerance++;	
			}
			else {
				//if the result is false, output not within message
				System.out.println("This rod is not within tolerance");
			}
			//output formatted percentage message,use division to calculate percentage
			System.out.printf("%d %% of rods entered so far have been within tolerance%n",(int)(countWithinTolerance/countTotal*100));
			
			//assign String which allow the program enter the following loop
			shouldContinue = "";
			/* the second small loop 
			 * to determine if user input is not "y" and "n"
			 * then enter the loop,
			 * eg. "abc" will be still in the loop
			 * "n" or "y" will go out of the loop
			 */
			while(!shouldContinue.equals("y")&& !shouldContinue.equals("n"))
			{
				//output message
				System.out.println("Do you wish to continue? (y/n)");
				//assign user input to variable shouldContinue
				shouldContinue = keyboard.next();	
			}
		}
		//output message if shouldContinue is 'n'
		System.out.println("Goodbye.");		

	}



}
