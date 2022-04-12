package day42_exceptions;

import java.util.Scanner;

public class C03_IllegalArgumentException {
    public static void main(String[] args) throws IllegalArgumentException {

        Scanner scan = new Scanner(System.in);
        System.out.print(" yasınızı gırınız :");
        int yas=scan.nextInt();

        if (yas<=0||yas>120){
           // System.out.println("lutfen gecerlı bır yas gırınız.");
            throw new IllegalArgumentException();
        }else{
            System.out.println("uygun yas gırdınız bravoo");
        }






    }
}
