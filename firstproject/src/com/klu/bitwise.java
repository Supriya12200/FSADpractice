package com.klu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bitwise {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader  isr  = new InputStreamReader(System.in);
	    BufferedReader br= new BufferedReader(isr);
	    //int b=Integer.parseInt(br.readLine());
	    int a=Integer.parseInt(br.readLine());
            //System.out.println(a&b)	;
            //System.out.println(a|b);
            //System.out.println(~a);
            //System.out.println(~b);
            System.out.println(a<<3);
            //System.out.println(b>>3);
            //System.out.println(a^b);
            }

}
