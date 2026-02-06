package com.klu;

import java.util.Scanner;

public class stringmethods {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int i=sc.nextInt();
			float f=(float) i;
			System.out.println(f);
			short s=(short) f;
			System.out.println(s)	;
		}	
	}
}