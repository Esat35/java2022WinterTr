package pratik;

public class MDArrays_soru03_T {
    public static void main(String[] args) {
        //Soru 3)
        //Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e sahip
        //elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru)
        // arr1 = { { 1,2},{ 3,4,5}, {6} } ve arr2 = { { 7,8,9}, { 10,11}, {12}}

        int arr1[][] = {{1, 2}, {3, 4, 5}, {6, 5, 8}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12, 2}};

        int toplam = 0;

        toplam = aynıIndexTopla(arr1, arr2);
        System.out.println("toplam : " + toplam);
    }

    private static int aynıIndexTopla(int[][] arr1, int[][] arr2) {
        int toplam = 0;
        if (arr1.length < arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                toplam += innerArrayElemanTopla(arr1[i], arr2[i]);
            }

        } else {
            for (int i = 0; i < arr2.length; i++) {
                toplam += innerArrayElemanTopla(arr1[i], arr2[i]);
            }
        }
        return toplam;
    }

    private static int innerArrayElemanTopla(int[] arr1, int[] arr2) {
        int toplam = 0;
        if (arr1.length < arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                toplam += arr1[i] + arr2[i];
            }

        } else {
            for (int i = 0; i < arr2.length; i++) {
                toplam += arr1[i] + arr2[i];
            }
        }

        return toplam;
    }


}
