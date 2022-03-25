package pratik;

public class For_soru2 {
    public static void main(String[] args) {
        //Soru 2 )
        //10 ile 30 arasindaki(10 ve 30 dahil) sayilari aralarinda virgul olarak ayni satirda yazdirin

        int sayı1=10;
                int sayı2=30;
        for (int i = sayı1; i <=sayı2 ; i++) {

            if (i!=sayı2){
                System.out.print(i+", ");
            }else System.out.print(i);

        }



    }
}
