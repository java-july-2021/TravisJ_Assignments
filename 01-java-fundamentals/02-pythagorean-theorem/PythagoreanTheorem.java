    //
//
// TRAVIS JEPSON 2021
//
// ASSIGNMENT - Pythagorean Theorem
//
    //
import java.util.Scanner;
import java.lang.Math;

// CAN BE DECLARED BEFORE OR AFTER AS LONG AS ITS OUTSIDE THE MAIN METHOD
public class PythagoreanTheorem {

// double legA = 1337;
// double legB = 9001;

    public double calculateHypotenuse(double legA, double legB) 
    {
    double legC = Math.sqrt(legA * legA + legB * legB);
    
    // Scanner keyboard = new Scanner(System.in);
    // int inputLegA;
    // int inputLegB;

    // System.out.println("Enter the value of leg A: ");
    // inputLegA = keyboard.nextInt();
    // legA = inputLegA;

    // while(inputLegA == 0)
	//  {
	// 	System.out.println("Enter an int: ");
	// 	input = keyboard.nextInt();
	//   }
        // System.out.println("\n" + "The value of leg C is: " + legC + "\n");
    System.out.println();
    System.out.println();
    System.out.println("The value of leg A is: " + legA);
    System.out.println();
    System.out.println("The value of leg B is: " + legB);
    System.out.println();
    return legC;
                // "The value of leg C is: " + legC;
        
                
    }
    
}
// calculateHypotenuse(3,6);
