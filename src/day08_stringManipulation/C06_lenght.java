package day08_stringManipulation;

import java.util.Random;

public class C06_lenght {
    public static void main(String[] args) {

        String str="Java her geçen gün daha da güzelleşiyor";

        //Sondan 3. karakteri yazdırın

        System.out.println(str.charAt(str.length()-3));// y

        //sondan 8. karakter

        System.out.println(str.charAt(str.length()-8));// l

        //Rastgele bir karakterini yazdıralım

        Random rnd=new Random();// rnd değeri için 0 ile 1 arasında rastgele bir değer oluşturur.

        int index= rnd.nextInt(str.length());// str.lengh den küçük rastgele bir int üretir

        System.out.println(str.charAt(index));// Her çalıştığında farklı bir karakteri yazdırır.








    }
}
