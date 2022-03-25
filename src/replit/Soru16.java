package replit;

import java.util.Arrays;

public class Soru16 {
    //Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array
    //
    //Input : {3,2,5,4,1,6}
    //
    //Output :
    //
    //min: 1
    //
    //max: 6


    public static void main(String[] args) {

      int arr[]={3,2,5,4,1,6};

      finMaxMin(arr);



    }

    private static void finMaxMin(int[] arr) {

        Arrays.sort(arr);

        int min =arr[0];
        System.out.println("min = " + min);
        int max=arr[arr.length-1];
        System.out.println("max = " + max);

    }
}
