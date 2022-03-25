package pratik;

import java.util.Arrays;
import java.util.Scanner;

public class MDArrays_soru05 {
    public static void main(String[] args) {
        //Soru
        //5 Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.print("bir cumle gırınız : ");
        String cumle=scan.nextLine();
        String arr[]=cumle.split(" ");

       // System.out.println(Arrays.toString(arr));

        int kelimeSayısı=arr.length;
        System.out.println("cumledekı kelıme sayısı : "+kelimeSayısı);

    }
}
