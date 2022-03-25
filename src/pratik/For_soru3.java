package pratik;

public class For_soru3 {
    public static void main(String[] args) {
        //Soru 3)
        //100’den baslayarak 50’ye(dahil) kadar olan sayilari aralarinda virgul olarak ayni satirda
        //yazdirin

        int sayı1=100;
        int sayı2=50;


        for (int i = sayı1; i>=sayı2 ; i--) {
            if (i !=sayı2) {
                System.out.print(i+", ");
            }else System.out.print(i);
        }



    }
}
