package pratik;

import java.util.Scanner;

public class While_soru3 {
    public static void main(String[] args) {
        //Soru 3 )
        //Kullanicidan baslangic ve bitis degerlerini alin. Baslangic degeri ve bitis degeri
        //dahil aradalarindaki tum cift tamsayilari while loop kullanarak ekrana yazdiriniz.

        Scanner scan=new Scanner(System.in);
        System.out.print("baslangıc degeri : ");
        int baslangıc=scan.nextInt();

        System.out.print("bitiş degeri : ");
        int bitis =scan.nextInt();


        while (bitis>=baslangıc){

            if (baslangıc%2==0){
                System.out.print(baslangıc+" ");
            }
            baslangıc++;
        }


    }
}
