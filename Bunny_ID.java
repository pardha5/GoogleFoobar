/*Bunny Prisoner Locating
=======================
Keeping track of Commander Lambda's many bunny prisoners is starting to get tricky. You've been tasked with writing a program to match bunny prisoner IDs to cell locations.
The LAMBCHOP doomsday device takes up much of the interior of Commander Lambda's space station, and as a result the prison blocks have an unusual layout. They are stacked in a triangular shape, and the bunny prisoners are given numerical IDs starting from the corner, as follows:
| 7
| 4 8
| 2 5 9
| 1 3 6 10
Each cell can be represented as points (x, y), with x being the distance from the vertical wall, and y being the height from the ground.
For example, the bunny prisoner at (1, 1) has ID 1, the bunny prisoner at (3, 2) has ID 9, and the bunny prisoner at (2,3) has ID 8. This pattern of numbering continues indefinitely (Commander Lambda has been taking a LOT of prisoners).
Write a function answer(x, y) which returns the prisoner ID of the bunny at location (x, y). Each value of x and y will be at least 1 and no greater than 100,000. Since the prisoner ID can be very large, return your answer as a string representation of the number.
Languages
=========
To provide a Python solution, edit solution.py
To provide a Java solution, edit solution.java
Test cases
==========
Inputs:
    (int) x = 3
    (int) y = 2
Output:
    (string) "9"
Inputs:
    (int) x = 5
    (int) y = 10
Output:
    (string) "96"
1,1 = 1
1,2 = 2
2,1 = 3
1,3 = 4
2,2 = 5
3,1 = 6
1,4 = 7
2,3 = 8
3,2 = 9
4,1 = 10
1,5 = 11
2,4 = 12
3,3 = 13
4,2 = 14
5,1 = 15
1,6 = 16
2,5 = 17
3,4 = 18
4,3 = 19
5,2 = 20
6,1 = 21
"""
*/


package com.pardha;

import java.util.Scanner;

public class Bunny_ID {

	public static String answer(long x, long y)
	{
		long series,sum;
		String res;
		series= (x+y)-1;
		sum= (series*(series-1))/2;
		res= Long.toString(sum+x);
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Comment scanner if inputs are provided
		Scanner sc= new Scanner(System.in);
		//reading inputs for x and y
		System.out.println("Enter values x and y");
		int x=sc.nextInt();
		int y=sc.nextInt();
		String ans= answer(x,y);
		System.out.println("Bunny ID: "+ans);
	}

}
