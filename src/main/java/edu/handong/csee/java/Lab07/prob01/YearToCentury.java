package edu.handong.csee.java.Lab07.prob01; // the package that perform YearToCentury class
import java.util.Scanner; // get the Scanner class from the package java.util

/**
 * This is YearToCentury class.</br>
 * You can calculate the century given a year that you input.</br>
 * After you input a year you want, then this class will calculate the century given a year.</br>
 * @author Bigstar</br>
 *
 */
public class YearToCentury {

	int year; // input the year.
	
	/**
	 * This method is constructor.</br>
	 * The constructor instantiates the object, YearToCentury class.</br>
	 */
	public YearToCentury()
	{
		year = 0 ; // call to initial integer, year.
	}
	
	/**
	 * This method is constructor.</br>
	 * @param year.</br>
	 */
	public YearToCentury(int year)
	{
		this.year = year; // the this keyword.
	}
	
	/**
	 * 	 This is a public method.</br>
	 *   This method will calculate the century given a year.</br>
	 */
	public int calculateYearToCentury()
	{
		if(year%100 == 0) // If remainder of division of 100 is 0
		{
			year = year / 100; // divide integer(year) to 100.
		}
		else 
		{
		 year = year / 100; // divide integer(year) to 100.
		 year = year + 1; // increase 1 of integer, year.
		}
		 return year; // return the integer, year.
	}
	
	/**
	 * This is a main method of the class.</br>
	 */
	public static void main(String[] args)
	{
		int thisyear; // set the integer, thisyear.
		Scanner keyboard = new Scanner(System.in); // Prepares to read from the keyboard.
		System.out.printf("Input year: "); // display the parenthesis.
		thisyear = keyboard.nextInt(); // scan the integer, thisyear.
		YearToCentury century = new YearToCentury(thisyear); // assign the object of class.
		System.out.println(thisyear + " is " + century.calculateYearToCentury() + "th century"); // display the return of method, integer(this year) and parenthesis.
		
	}
}
