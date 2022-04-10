package day39_overriding;

public class Toyota extends Araba {

    String hız="toyota araclar max 220 km hız yapar";
    String marka="toyota";
String sirketMerkezi="japonya";


    public void motor(){
        System.out.println("toyota arabalar toyota marka motor kullanırlar");
    }

  public void garanti(){
      System.out.println("toyota araclar 10 yıl garantılıdır.");
  }
}
