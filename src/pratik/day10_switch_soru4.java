package pratik;

import java.util.Scanner;

public class day10_switch_soru4 {
    public static void main(String[] args) {

        //Soru
        //4 Kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin
        //Kullanici
        //S girerse “
        //D
        //girerse “
        //E
        //girerse “
        //T
        //girerse “In Testing” yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("SDET kisaltmasindaki harflerden birini giriniz");
        char harf = scan.next().toUpperCase().charAt(0);

        switch (harf) {

            case 'S':
                System.out.println("Softvare");
                break;
            case 'D':
                System.out.println("Developer");
                break;
            case 'E':
                System.out.println("Engineer");
                break;
            case 'T':
                System.out.println("Testing");
                break;
            default:
                System.out.println("Hatalı gırıs");
        }


    }
}
