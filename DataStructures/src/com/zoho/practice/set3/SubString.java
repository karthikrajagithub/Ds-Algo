package com.zoho.practice.set3;

import java.util.Scanner;

/*4. Find if a String2 is substring of String1. If it is, return the index of the first occurrence. else return -1.

Eg 1:Input:
        String 1: test123string
         String 2: 123
        Output: 4
Eg 2: Input:
        String 1: testing12
        String 2: 1234 
        Output: -1
*/
public class SubString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String main = sc.nextLine();
		String pat = sc.nextLine();
		
		System.out.println(isSubString(main,pat));
		
		
	}
	static int isSubString(String main,String pattern)
	{
		int patLength = pattern.length();
		int strLength = main.length();
		for(int i=0;i<strLength-patLength;i++)
		{
			int j;
			for(j=0;j<patLength;j++)
			{
				if(main.charAt(j+i) != pattern.charAt(j))
					break;
			}
			if(j==patLength)
				return i;
		}
		
		return -1;
		
	}
	
	
}
