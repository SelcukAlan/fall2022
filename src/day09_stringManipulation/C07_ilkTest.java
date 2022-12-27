package day09_stringManipulation;

public class C07_ilkTest {
    public static void main(String[] args) {

        //Gittiğimiz web sayfasından aldığımız String arama sonuçlarından
        // arama  sonuç sayısının 50 den fazla olduğunu test edin.

        String input= "1-48 of 87 results for \"nutella\"";

        int indexOf=input.indexOf("of");
        int indexResults=input.indexOf("results");
        String sonuçSayısıString=input.substring(indexOf+3,indexResults-1);

       // System.out.println(sonuçSayısıString);//87

        int sonuçSayısıInt=Integer.parseInt(sonuçSayısıString);

        if (sonuçSayısıInt>50){


            System.out.println("Nutella arama testi PASSED");
        }else {
            System.out.println("nutella arama testi FAİLED");
        }







    }
}
