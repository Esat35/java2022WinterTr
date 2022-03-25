package replit;

public class Soru07 {
    //Write java code checking the number is Perfect number or not.
    //
    //Any number can be a Java Perfect Number if the sum of its positive divisors excluding the number itself is equal to that number.
    //Input :6 Output:6 is Perfect Number Input :7 Output:7 is not Perfect Number


    public static void main(String[] args) {

        int sayı1=6;
        int sayı2=7;
        int toplam=0;


        for (int i = 1; i <sayı1 ; i++) {
            if (sayı1%i==0){
                toplam+=i;
            }

        }

        if (toplam==sayı1) {
            System.out.println(sayı1+" is Perfect Number");
        }

    }
}
