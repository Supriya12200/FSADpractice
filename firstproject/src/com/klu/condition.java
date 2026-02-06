package com.klu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class condition {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
char ch =(char) br.read();

System.out.println("is an alphabet"+ Character.isLetter(ch));
System.out.println("is an digit"+ Character.isDigit(ch));


	}

}
