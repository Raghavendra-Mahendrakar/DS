package com.arraysProject;

import java.util.Arrays;

public class oneDArray {
	
	public static void main(String[] args) {
		int[] oneD=new int[5];
		oneD[0]=10;
		oneD[1]=10;
		oneD[2]=10;
		oneD[3]=10;
		oneD[4]=10;
//		oneD[5]=10;  //for this line we will get the error because ArrayIndexOutOfBound
		
		//ways to access arrays
		//1st way
		System.out.println("1st way");
		for(int i=0;i<oneD.length;i++) {
			System.out.println(oneD[i]);
		}
		
		//2nd Way
		System.out.println("\n2nd way");
		for(int arr:oneD) {
			System.out.println(arr);
		}
		
		//3rd way
		System.out.println("\n3rd way");
		Arrays.stream(oneD).forEach(System.out::println);
		
		//Print an array as String of elements
		System.out.println("\nTo print Array as String of element");
		System.out.println(Arrays.toString(oneD));
	}

}
