package com.zoho.practice.set3;

import java.util.Scanner;

/*
  1. Write a program to give the following output for the given input

		Eg 1: Input: a1b10
       		Output: abbbbbbbbbb
		Eg: 2: Input: b3c6d15
          	Output: bbbccccccddddddddddddddd
		The number varies from 1 to 99.
 */
public class PrintCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringBuilder sb = new StringBuilder();

		char c[] = str.toCharArray();

		for (int i = 0; i < c.length; i++) {
			int val = 0;

			if (c[i] >= '0' && c[i] <= '9') {
				try {
					if (c[i + 1] >= '0' && c[i + 1] <= '9') {
						// Used to print more than 9 values
						String a1 = String.valueOf(c[i] - 48);
						String a2 = String.valueOf(c[i + 1] - 48);

						val = Integer.parseInt(a1 + a2);

						PrintSeq(sb, val, c[i - 1]);

						i++;
					} else {
						// Used to print 0-9 values
						val = c[i] - 48;
						PrintSeq(sb, val, c[i - 1]);
					}
				} catch (ArrayIndexOutOfBoundsException ex) {
					val = c[i] - 48;
					PrintSeq(sb, val, c[i - 1]);
				}
			}
			/*
			 * else { System.out.print(c[i]); }
			 */
		}
		System.out.print(sb.toString());
	}

	static void PrintSeq(StringBuilder sb, int len, char c) {
		for (int i = 0; i < len; i++) {
			sb.append(c);
		}
	}
}
