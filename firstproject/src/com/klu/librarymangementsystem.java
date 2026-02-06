package com.klu;

public class librarymangementsystem {

	public static void main(String[] args) {
        String bookCode = "FIC-HarryPotter-2007";

        
        String[] parts = bookCode.split("-"); 
        String genre = parts[0];
        String title = parts[1];
        String year = parts[2];

        String titleUpper = title.toUpperCase();

       
        boolean startsWithF = genre.startsWith("F");

        
        System.out.println("Book Information:");
        System.out.println("-----------------");
        System.out.println("Original Code : " + bookCode);
        System.out.println("Genre         : " + genre);
        System.out.println("Title         : " + titleUpper);
        System.out.println("Year          : " + year);
        System.out.println("Genre starts with 'F'? " + (startsWithF ? "Yes" : "No"));
    }
}
	


