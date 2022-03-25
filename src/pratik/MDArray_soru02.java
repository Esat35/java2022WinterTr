package pratik;

public class MDArray_soru02 {
    public static void main(String[] args) {
        //Soru 2)
        //Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini
        //ekrana yazdiran bir program yaziniz { { 1,2,3}, { 4,5}, {6}}
        int carpım=1;

        int arr[][]={ { 1,2,3}, { 4,5}, {6}};

        for (int i=0; i<arr.length; i++) {

                carpım*=arr[i][arr[i].length-1];

        }
        System.out.println("carpım :"+carpım);
    }
}
