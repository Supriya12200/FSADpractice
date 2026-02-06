package com.klu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class input {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
    InputStreamReader  isr  = new InputStreamReader(System.in);
    BufferedReader br= new BufferedReader(isr);
    int i= Integer.parseInt(br.readLine());
    float f= Float.parseFloat(br.readLine());
    System.out.println(i);
    System.out.println(f);
    
	}

	
}
