package com.bridgelabz.functional_programs.twodimensionalarray;

import java.util.*;
/**
 * class to create and print the two dimensional array 
 * @author Aravind
 *
 */
public class TwoDimensionalArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows,columns?");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int arr[][] = new int[r][c];
		//ask user to enter array elements
		System.out.println("Enter array elements :");
		for (int i=0;i<r;i++)
		{
			for (int j=0;j<c;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		//display array elements
		for (int i=0;i<r;i++)
		{
			for (int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+ "\t");
			}
			System.out.println();
		}
	}

}
