/*********************************************************************************** * 
------------------------------------------------------------------------------------ 
* 		 File name: Project3.java 
*        Project name: CSCI 1250 Project 3 
* ------------------------------------------------------------------------------------ 
*     Author Name: Ryan 
*     Author E-mail: shuper@etsu.edu 
*     Course-Section: CSCI-1250-004
*     Creation Date: 10/20/17 
*     Date of Last Modification: 10/27/17 
* ------------------------------------------------------------------------------------ */
import java.util.Scanner;
/*********************************************************************************** 
 * Class Name: Project3 <br> 
 *  Class Purpose: Project 3 <br> 
 *  
 *   <hr> 
 *   Date created: 10/20/17 <br> 
 *   Date last modified: 10/27/17 
 *   @author Ryan Shupe */

public class Project3 {
	
	/******************************************************************************** 
	* Method Name: main <br> 
	* Method Purpose: To develop a program in Java that will ask for 3 test scores, then it will calculate the average
	*                 then, it will assign a letter grade from the average score, and also a gpa number from the letter grade.
	*				  At the end it will ask the user if they would like to run the program again.
	* <br> 
	* 
	* <hr> 
	* Date created: 10/20/17 <br> 
	* Date last modified: 10/27/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	* 
	* 
	* 
	* <hr> 
		@param args  Command Line Arguments 
	*/
	
	public static void main(String[] args){
		double testScore1; //value of test score 1
		double testScore2; //value of test score 2
		double testScore3; //value of test score 3
		double average; //the average of all test scores
		double gpa; //gpa number 0-4
		
		char letterGrade = 0; //letter grade from average test score
		char runAgain = 'Y'; // letter to run the program again or not Y or N.
		
		do {
			displayWelcomeMessage();
			pressEnterToContinue();
			
			System.out.println("Test 1");
			testScore1 = getTestScore();
			
			System.out.println("Test 2");
			testScore2 = getTestScore();
			
			System.out.println("Test 3");
			testScore3 = getTestScore();
			
			average = calcAverage(testScore1, testScore2, testScore3);
			System.out.println("The average of all 3 test scores is: " + average);
			
			letterGrade = findLetterGrade(average);
			System.out.println("The letter grade is: " + letterGrade);
			
			gpa = calcGPA(letterGrade);
			System.out.println("The GPA is: " + gpa);
			
			pressEnterToContinue();
			
			runAgain = runAgain();
		}while(runAgain == 'Y');
			
		displayEndingMessage();
		pressEnterToContinue();
	}//end main
	
	/******************************************************************************** 
	* Method Name: displayWelcomeMessage <br> 
	* Method Purpose: To display a welcome messsage to the user   
	*      <br> 
	* 
	* <hr> 
	* Date created: 10/27/17 <br> 
	* Date last modified: 10/27/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  
	* 
	* <hr> 
	*/  
	
	public static void displayWelcomeMessage() {
		System.out.println("Welcome to my program! :D");
		System.out.println("       Ryan Shupe        ");
		System.out.println(" CSCI 1250-004 Project 3 ");
	}//end welcome message
	
	/******************************************************************************** 
	* Method Name: displayEndingMessage <br> 
	* Method Purpose: To display an ending messsage to the user   
	*      <br> 
	* 
	* <hr> 
	* Date created: 10/27/17 <br> 
	* Date last modified: 10/27/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  
	* 
	* <hr> 
	*/  
	
	public static void displayEndingMessage() {
		System.out.println("Thank you for using my program!");
	} //end ending message
	
	/******************************************************************************** 
	* Method Name: pressEnterToContinue <br> 
	* Method Purpose: To display press enter to continue, then wait for the user to press enter  
	*      <br> 
	* 
	* <hr> 
	* Date created: 10/27/17 <br> 
	* Date last modified: 10/27/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  
	* 
	* <hr> 
	*/  
	
	public static void pressEnterToContinue() {
		Scanner input = new Scanner(System.in);
		System.out.println("Press Enter to continue...");
		input.nextLine();
	} // end enter to continue
	
	/******************************************************************************** 
	* Method Name: displayWelcomeMessage <br> 
	* Method Purpose: Gets a test score from the user to store in a variable   
	*      <br> 
	* 
	* <hr> 
	* Date created: 10/27/17 <br> 
	* Date last modified: 10/27/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  
	*
	* @return testScore<hr> 
	*/  
	public static double getTestScore() {
		double testScore; // the value of the current test score 
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("Enter a test score 0 - 100: ");
			testScore = input.nextDouble();
		}while(testScore < 0 || testScore > 100);
		
		return testScore;	//returns a testscore
	} //end get test score
	
	/******************************************************************************** 
	* Method Name: calcAverage <br> 
	* Method Purpose: To calculate the average of all three test scores.   
	*      <br> 
	* 
	* <hr> 
	* Date created: 10/27/17 <br> 
	* Date last modified: 10/27/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	* @param testScore1  value for test score 1
	*  @param testScore2  value for test score 2
	*  @param testScore3  value for test score 3
	* @return average
	* <hr> 
	*/  
	
	public static double calcAverage(double testScore1, double testScore2, double testScore3) {
		double average; // average of all 3 test scores
		
		average = (testScore1 + testScore2 + testScore3) / 3;
		
		return average;	//returns an average of all 3 
	} // end calc average
	
	/******************************************************************************** 
	* Method Name: findLetterGrade <br> 
	* Method Purpose: To match the average test score to a letter grade.   
	*      <br> 
	* 
	* <hr> 
	* Date created: 10/27/17 <br> 
	* Date last modified: 10/27/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  @param average the average of all 3 test grades
	*  @return letterGrade
	* <hr> 
	*/  
	
	public static char findLetterGrade(double average) {
		char letterGrade = 0; // letter corresponding to the average number
		
		if (average >= 90) {
			letterGrade = 'A';
		}else if (average >= 80) {
			letterGrade  = 'B';
		}else if (average >= 70) {
			letterGrade = 'C';
		}else if (average >= 60) {
			letterGrade = 'D';
		}else {
			letterGrade = 'F';
		}
		
		return letterGrade; // returns a lettergrade
	} //end find letter grade
	
	/******************************************************************************** 
	* Method Name: findLetterGrade <br> 
	* Method Purpose: To match the letter grade to a GPA score.   
	*      <br> 
	* 
	* <hr> 
	* Date created: 10/27/17 <br> 
	* Date last modified: 10/27/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*  @param letterGrade the letter associated to the grade
	*  @return gpa
	* <hr> 
	*/  
	
	public static double calcGPA(char letterGrade) {
		double gpa = 0; //gpa corresponding to the letter grade
		
		if (letterGrade == 'A') {
			gpa = 4.0;
		}else if (letterGrade == 'B') {
			gpa = 3.0;
		}else if (letterGrade == 'C') {
			gpa = 2.0;
		}else if (letterGrade == 'D') {
			gpa = 1.0;
		}else {
			gpa = 0.0;
		}
		
		return gpa;	//returns a gpa number
	}// end calc gpa
	
	/******************************************************************************** 
	* Method Name: findLetterGrade <br> 
	* Method Purpose: To ask the user if they would like to run the program again. a Y or an N is the only answer.   
	*      <br> 
	* 
	* <hr> 
	* Date created: 10/27/17 <br> 
	* Date last modified: 10/27/17 <br> 
	* 
	* <hr> 
	* Notes on specifications, special algorithms, and assumptions: 
	*  
	*   
	*  @return runAgainChar
	* <hr> 
	*/  
	public static char runAgain() {
		char runAgainChar; //Y or N to run the program again
		String answer; //whatever answer the user types in the console
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Do you wish to run the program again?:");
		answer = input.nextLine().toUpperCase();
		runAgainChar = answer.charAt(0);
		
		while(runAgainChar != 'Y' && runAgainChar != 'N') {
			System.out.println("ERROR: Please enter a valid option...");
			System.out.print("Do you wish to run the program again?:");
			answer = input.nextLine().toUpperCase();
			runAgainChar = answer.charAt(0);
		} // input validation Y or N
		
		return runAgainChar; //returns a Y or N 
		
	} // end run again	
}//end Class