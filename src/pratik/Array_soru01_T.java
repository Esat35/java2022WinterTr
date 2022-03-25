package pratik;

import java.util.Arrays;

public class Array_soru01_T {
    public static void main(String[] args) {

        //Soru 1:
        //Verilen 3 elemanli bir array’in tum elemanlarini bir soldaki konuma tasiyacak bir
        //program yazin. Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.

        int arr[]={3,5,7,6,1};
        int temp;
        int temp2=arr[0];

        for (int i = 0; i < arr.length-1 ; i++) {

            temp=arr[i];
            arr[i]=arr[i+1];

        }
        arr[arr.length-1]=temp2;

        System.out.println(Arrays.toString(arr));


    }
}
