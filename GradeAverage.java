/**
 * 
 */
package edu.gsu.csc1301.gradeaverage;
import java.util.Scanner;
/**
 * This program calculates the average grade of 
 * a student given multiple test and exam inputs 
 * 
 * @author Patrick Copeland
 * @version 03/08/2020
 */
public class GradeAverage
{
	
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Declare constants for various exam weights
		final double TEST = 0.40;
		final double FINAL = 0.35;
		final double MIDTERM = 0.25;
		
		//Gather input data
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Test score #1: ");
		double testOne = in.nextDouble();
		
		System.out.print("Enter Test score #2: ");
		double testTwo = in.nextDouble();
		
		System.out.print("Enter Test score #3: ");
		double testThree = in.nextDouble();
		
			//Calculate test average and store
		double testAverage = (testOne + testTwo + testThree) / 3;
		
		System.out.print("Enter Midterm exam score: ");
		double midtermExam = in.nextDouble();	
		
		System.out.print("Enter Final exam score: ");
		double finalExam = in.nextDouble();
		
		// Calculate weighted and average grade
		double gradeAverage = (testAverage * TEST + finalExam * FINAL + midtermExam * MIDTERM);
		
		// Assign letter grade to grade averages
		char grade;
		if (gradeAverage >= 90)
		{
			grade = 'A';
		}
		else if (gradeAverage >= 80 && gradeAverage <90)
		{
			grade = 'B';
		}
		else if (gradeAverage >= 70 && gradeAverage < 80)
		{
			grade = 'C';
		}
		else if (gradeAverage >= 60 && gradeAverage < 70)
		{
			grade = 'D';
		}
		else
		{
			grade = 'F';
		}
		
		// Print final results
		System.out.printf("Grade Average: %.2f%n", gradeAverage);
		System.out.println("Letter grade:  " + grade);
		
		if (grade == 'C' || grade == 'D')
		{
			System.out.println("I'm sorry. You will have to repeat the course before advancing.");
		}
		else
		{
			System.out.println("Good job. You met the prerequisite for the next course.");
		}
		in.close();
	}
}
