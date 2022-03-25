package pratik;

import java.util.Arrays;

public class MDArrays_soru06 {
    public static void main(String[] args) {
        //Soru 6)
        //Verilen bir Array’den isten degere esit olan elamanlari kaldirip, kalanlari yeni bir
        //Array olarak yazdiran bir method yaziniz

        int arr[] = {2, 5, 6, 3, 2, 4, 8, 9, 4, 2, 3, 3, 4, 2, 6, 4, 5};

        int istenmeyenDeger = 2;

        yeniArrayyap(arr, istenmeyenDeger);


    }

    private static void yeniArrayyap(int[] arr, int istenmeyenDeger) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (istenmeyenDeger == arr[i]) {
                count++;
            }
        }


        int arrYeni[] = new int[arr.length - count];
        count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (istenmeyenDeger != arr[i]) {

                arrYeni[count] = arr[i];
                count++;
            }
        }

        System.out.println("yeni array : " + Arrays.toString(arrYeni));
    }
}
