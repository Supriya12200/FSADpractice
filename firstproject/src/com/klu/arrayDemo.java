package com.klu;

import java.util.Scanner;

public class arrayDemo {

	public static void main(String[] args) {
		
int marks[]=new int[5];
Scanner sc= new Scanner(System.in);
String name = sc.next();
long rollno=sc.nextLong();
for(int i=0;i<5;i++) {
	marks[i]=sc.nextInt();
}
System.out.println("display the give marks");
for( int i=0;i<marks.length;i++) {
	System .out.println(marks[i]);
}
System.out.println(name);
System.out.println(rollno);

	}

}
