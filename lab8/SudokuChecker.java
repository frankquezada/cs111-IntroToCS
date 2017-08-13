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

import java.util.Scanner; // imports the scanner class

public class SudokuChecker
{

	// Private Data Members
	private int w1, w2, w3, w4; //row1
	private int x1, x2, x3 ,x4; //row2
	private int y1, y2, y3, y4; //row3
	private int z1, z2, z3, z4; //row4
	private int r1, r2, r3, r4; //rows addition variables
	private int c1, c2, c3, c4; //columns addition variables
	private int reg1, reg2, reg3, reg4; //regions addition variables

	Scanner scan = new Scanner(System.in);

	// Constructor
	public SudokuChecker() // constructor declaration
	{
	w1 = 0;
	w2 = 0;
	w3 = 0;
	w4 = 0;
	x1 = 0;
	x2 = 0;
	x3 = 0;
	x4 = 0;
	y1 = 0;
	y2 = 0;
	y3 = 0;
	y4 = 0;
	z1 = 0;
	z2 = 0;
	z3 = 0;
	z4 = 0;

	}
	// inputGrid
	public void inputGrid()
	{
	
	// Row 1 - User Input
	System.out.print("Enter Row 1: "); //ask user to enter 1st row
	w1 = scan.nextInt();
	w2 = scan.nextInt();
	w3 = scan.nextInt();
	w4 = scan.nextInt();

	// Row 2 - User Input
	System.out.print("Enter Row 2: "); //ask user to enter 2nd row
	x1 = scan.nextInt();
	x2 = scan.nextInt();
	x3 = scan.nextInt();
	x4 = scan.nextInt();

	// Row 3 - User Input
	System.out.print("Enter Row 3: "); //ask user to enter 3rd row
	y1 = scan.nextInt();
	y2 = scan.nextInt();
	y3 = scan.nextInt();
	y4 = scan.nextInt();

	// Row 4 - User Input
	System.out.print("Enter Row 4: "); //ask user to enter 4th row
	z1 = scan.nextInt();
	z2 = scan.nextInt();
	z3 = scan.nextInt();
	z4 = scan.nextInt();

	// Rows - Addition
	r1 = w1+w2+w3+w4; //row1
	r2 = x1+x2+x3+x4; //row2
	r3 = y1+y2+y3+y4; //row3
	r4 = z1+z2+z3+z4; //row4

	// Columns - Addition
	c1 = w1+x1+y1+z1; //column1
	c2 = w2+x2+y2+z2; //column2
	c3 = w3+x3+y3+z3; //column3
	c4 = w4+x4+y4+z4; //column4

	// Regions - Addition
	reg1 = w1+w2+x1+x2; //region1
	reg2 = w3+w4+x3+x4; //region2
	reg3 = y1+y2+z1+z2; //region3
	reg4 = y3+y4+z3+z4; //region4

	}



	// checkGrid
	public void checkGrid()
	{

	// REGIONS CHECK

	// Region 1
	if (reg1 == 10) {
	System.out.println("\nREG-1: GOOD");
	}
	else {
	System.out.println("\nREG-1: NO GOOD");
	}

	// Region 2
	if (reg2 == 10) {
	System.out.println("REG-2: GOOD");
	}
	else {
	System.out.println("REG-2: NO GOOD");
	}

	// Regions 3
	if (reg3 == 10) {
	System.out.println("REG-3: GOOD");
	}
	else {
	System.out.println("REG-3: NO GOOD");
	}

	// Regions 4	
	if (reg4 == 10) {
	System.out.println("REG-4: GOOD\n");
	}
	else {
	System.out.println("REG-4: NO GOOD\n");
	}


	// ROWS CHECK

	// Row 1
	if (r1 == 10) {
	System.out.println("ROW-1: GOOD");
	}
	else {
	System.out.println("ROW-1: NO GOOD");
	}

	// Row 2
	if (r2 == 10) {
	System.out.println("ROW-2: GOOD");
	}
	else {
	System.out.println("ROW-2: NO GOOD");
	}

	// Row 3
	if (r3 == 10) {
	System.out.println("ROW-3: GOOD");
	}
	else {
	System.out.println("ROW-3: NO GOOD");
	}

	// Row 4	
	if (r4 == 10) {
	System.out.println("ROW-4: GOOD\n");
	}
	else {
	System.out.println("ROW-4: NO GOOD\n");
	}


	// COLUMNS CHECK

	// Column 1
	if (c1 == 10) {
	System.out.println("COL-1: GOOD");
	}
	else {
	System.out.println("COL-1: NO GOOD");
	}

	// Column 2
	if (c2 == 10) {
	System.out.println("COL-2: GOOD");
	}
	else {
	System.out.println("COL-2: NO GOOD");
	}

	// Column 3
	if (c3 == 10) {
	System.out.println("COL-3: GOOD");
	}
	else {
	System.out.println("COL-3: NO GOOD");
	}

	// Column 4	
	if (c4 == 10) {
	System.out.println("COL-4: GOOD\n");
	}
	else {
	System.out.println("COL-4: NO GOOD\n");
	}



	}

}
