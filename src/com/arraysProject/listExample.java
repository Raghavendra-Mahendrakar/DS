package com.arraysProject;

import java.util.ArrayList;
import java.util.List;

public class listExample {
	public static void main(String[] args) {

		// The Declaration that hold hetrogeneous elements
		List colors = new ArrayList();
		colors.add("white");
		colors.add(3);
		// To print the Data present inside List :
		System.out.println(colors);

		// To printthe size of List :
		System.out.println(colors.size());

		// To check whether List contain mentioned content :
		System.out.println(colors.contains("white"));

		// Different ways to loop the Array
		// 1St way to loop an list
		for (int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i));
		}

		// 2nd way to loop an list
		colors.forEach(System.out::println);

		// To Hold particular list type
		List<String> colors1 = new ArrayList<>();
		colors1.add("yellow");
//		colors1.add(3);		//This type is not allowed because we declared List as String type

		// 3rd way to loop an list
		for (String color : colors1) {
			System.out.println(color);

		}
	}
}
