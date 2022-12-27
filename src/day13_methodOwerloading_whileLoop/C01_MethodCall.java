package day13_methodOwerloading_whileLoop;

import day12_methodCreation.C03_AsalSayı;
import day12_methodCreation.C07_TerseÇevirme;
import day12_methodCreation.C09_FibonacciSerisi;

public class C01_MethodCall {
    public static void main(String[] args) {

        //İlk 15 finonacci sayısını yazdırın.

        C09_FibonacciSerisi.fibonaccidenSayiYazdir(15);//0 1 1 2 3 5 8 13 21 34 55 89 144 233 377

        // aşağıda verilen cümleyi tersine çevirin

        String str="Bir kere yaparım, yan gelir yatarım";

      String tersStr =C07_TerseÇevirme.metniTerseCevir(str);
        System.out.println(tersStr);//mıratay rileg nay ,mırapay erek riB

        //aşağıda verilen cümlenin palindrome olup olmadığını yazdırın

        str="Java candır";
        tersStr=C07_TerseÇevirme.metniTerseCevir(str);

        if (str.equals(tersStr)){
            System.out.println("palindrome");
        }else {
            System.out.println("polindrome değil");
        }

        //aşağida verilen sayının asal sayı olup olmadığını yazdırın

        int sayı=23;

        System.out.println(C03_AsalSayı.asalSayıMı(sayı));//true

        //kullanıcı true falseden bir şey anlamaz derseniz, açık şekilde yazalım

        boolean sonuç= C03_AsalSayı.asalSayıMı(sayı);

        if (sonuç){
            System.out.println("Girilen " +sayı+ " asal");
        }else {
            System.out.println("Girilen " +sayı+ " asal sayı değil");


        }

    }
}
