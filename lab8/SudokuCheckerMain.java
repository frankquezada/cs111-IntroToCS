//********************************
// Honor Code: The work I am submitting is a result of my own thinking and efforts.
// Francisco Quezada
// CMPSC 111 Spring 2016
// Lab 8
// Date: 03/09/16
//
// Purpose: Enhance experience with constructing and executing our own java classes.
// Creating and calling instance variables. Creating both constructors and methods.
// Learning how to use if/else statements. Apply all the above to a Sudoku checker.
// *******************************
import java.util.Date;

public class SudokuCheckerMain
{
	public static void main(String[] args)
	{
	
		SudokuChecker checker = new SudokuChecker();
		
		System.out.println("++++Welcome to Frank's Sudoku Puzzle++++");
		System.out.println("Francisco Quezada, Lab #8, " + new Date()+"\n");
		checker.inputGrid();
		checker.checkGrid();

	}
}
