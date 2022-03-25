package replit;

public class Soru05 {
    //Print even numbers from 20 to 0 but do not use decrement (i--).
    //
    //OUTPUT : Even Numbers from 100 to 0 are: 20 18 16 14 12 10 8 6 4 2 0


    public static void main(String[] args) {

        int sayı=20;
        System.out.print("Even Numbers from 20 to 0 are: ");
            while (sayı>0){
                System.out.print(sayı+" ");
            sayı-=2;

            }
        System.out.println(" 0");
    }
}
