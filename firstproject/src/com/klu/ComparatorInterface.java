package com.klu;



import java.util.*;

class Ascend implements Comparator<Integer>
{
 public int compare(Integer i1,Integer i2)
 { 
  return i1.compareTo(i2);
 }
}

class Descend implements Comparator<Integer>
{
 public int compare(Integer i1,Integer i2)
 { 
  return i2.compareTo(i1);
 }
}

public class ComparatorInterface {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = sc.nextInt();

        //array declare
        Integer arr[] = new Integer[size];

        //reading elements->array
        System.out.println("Enter"+size+"elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        //sorting AO
        Arrays.sort(arr, new Ascend());
        // Display sorted array
        System.out.println("Sorted in AO:");
        display(arr);
          
        //sorting DO
        Arrays.sort(arr, new Descend());
        System.out.println("");
        // Display sorted array
        System.out.println("Sorted in DO:");
        display(arr);

        sc.close();
    }

    private static void display(Integer[] arr) {
        for (Integer i : arr) {
            System.out.print(i + "\t");
        }
     
    }
}
