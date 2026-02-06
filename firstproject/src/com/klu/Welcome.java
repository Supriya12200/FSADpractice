package com.klu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Welcome {

	public static void main(String[] args) throws IOException {
		
       int i=0;
       InputStreamReader isr = new InputStreamReader(System.in);
       BufferedReader br = new BufferedReader(isr);
       String str = br.readLine();
       do {
    	   System.out.println(str);
    	   i++;
        
        }while(i<15);
       
	}

}
