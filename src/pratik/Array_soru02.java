package pratik;

public class Array_soru02 {
    public static void main(String[] args) {
        //Soru 2:
        //Verilen bir array’in tum elemanlarini toplayan bir program yazalim.

        int arr[]={2,3,5,7,8,9,4,4};

        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {
            toplam+=arr[i];


        }

        System.out.println("toplam : "+toplam);
    }
}
