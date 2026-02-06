package com.klu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class looping {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
int i = Integer.parseInt(br.readLine());
System.out.println("you are " +i + " old");

	}

}
