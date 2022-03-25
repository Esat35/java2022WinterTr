package pratik;

import java.util.Scanner;

public class For_soru6 {
    public static void main(String[] args) {
        //Soru 6) Interview Question
        //Kullanicidan 100’den kucuk bir tamsayi isteyin. 1’den baslayarak
        //girilen sayiya kadar tum sayilari yazdirin. Ancak;
        //-
        //Sayi 3’un kati ise sayi yerine “Java” yazdirin.
        //-
        //Sayi 5’in kati ise sayi yerine “Guzeldir” yazdirin.
        //-
        //Sayi hem 3’un hem 5’in kati ise sayi yerine “Java Guzeldir” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.print("100 den kucuk bır tam sayı gırınız : ");
        int sayı=scan.nextInt();


        for (int i = 1; i <=sayı ; i++) {

            if (i%15==0){
                System.out.print("Java guzeldır ");
            }else if (i%5==0){
                System.out.print("Guzeldır ");
            }else if (i%3==0){
                System.out.print("Java ");
            }else{
                System.out.print(i+" ");
            }


        }



    }
}
