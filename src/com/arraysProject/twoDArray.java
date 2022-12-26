package com.arraysProject;

import java.util.Arrays;

public class twoDArray {

	public static void main(String[] args) {
		//1st way to declare the 2D Array
		int[][] twoD=new int[2][2];
		for(int i=0;i<twoD.length;i++) {
			for(int j=0;j<twoD[i].length;j++) {
				twoD[i][j]=0;
			}
		}
		
		//1st way to print 2DAarry
		System.out.println("1st way to print 2DArrys");
		for(int i=0;i<twoD.length;i++) {
			for(int j=0;j<twoD[i].length;j++) {
				System.out.print(twoD[i][j]);
			}
			System.out.println();
		}
		
		//2nd way to print 2DArray
		System.out.println("2nd way to print 2DArrys");
		System.out.println(Arrays.deepToString(twoD)+"\n");
		
		//2nd way to declare two Array
		int twoD1[][]= {{1,1,1},{1,1,1}};
		
//		for(int i=0;i<twoD.length;i++) {
//			for(int j=0;j<twoD[i].length;j++) {
//				System.out.print(twoD1[i][j]);
//			}
//			System.out.println();
//		}
	}
}
