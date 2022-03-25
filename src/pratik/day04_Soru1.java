package pratik;

public class day04_Soru1 {
    public static void main(String[] args) {

        //Soru 1 )
        //byte veri tipinde bir degisken olusturun, short,int,float ve double data tiplerinde
        //birer degisken olusturup adim adim widening yapin ve yazdirin

        byte sayı1=120;
        System.out.println(sayı1);//120

        short sayı2=sayı1;
        System.out.println(sayı2);//120

        int sayı3=sayı1;
        System.out.println(sayı3);//120

        float sayı4=sayı1;
        System.out.println(sayı4);//120.0


        double sayı5=sayı1;
        System.out.println(sayı5);//120.0
    }
}
