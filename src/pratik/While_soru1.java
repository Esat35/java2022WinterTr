package pratik;

public class While_soru1 {
    public static void main(String[] args) {
        //Soru 1 )
        //While loop kullanarak 3 den 13 e kadar tum tek tamsayilari ekrana yazdiriniz.

        int sayı=3;

        while (sayı<=13){

                if (sayı%2!=0){
                    System.out.print(sayı+" ");
                }

            sayı++;
        }

    }
}
