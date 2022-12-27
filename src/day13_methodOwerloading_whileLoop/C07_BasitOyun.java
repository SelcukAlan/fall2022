package day13_methodOwerloading_whileLoop;

import java.util.Random;
import java.util.Scanner;

public class C07_BasitOyun {
    public static void main(String[] args) {
        /*
        random olarak 1 le 100 arasında bir sayı oluşturun
        kullanıcıdan bu sayıyı bilmesini isteyin kullanıcı her değer girdiğinde
        tuttuğunuz sayı ile karşılaştırıp tahminini büyült veya küçült diyelim
        kullanıcı tuttuğumuz sayıyı bildiğinde

        -3 veya daha az tahminde bildiyse "Vooww"
        - 4-8 tahminde bildiyse "Aferin"
        -daha fazla tahminde bildiyse "başarısız"
        yazdırın
         */
        Random rnd=new Random();
        int tutulanSayı=rnd.nextInt(100);
        int sayaç=1;
        int tahmin=1;

        Scanner scan=new Scanner(System.in);

        while (tutulanSayı!=tahmin){

            System.out.println("Lütfen bir tahmin giriniz");
            tahmin=scan.nextInt();

            if (tutulanSayı==tahmin){
                System.out.println(sayaç + "tahmin ile tuttuğum sayıyı buldun");
                if (sayaç<=3){
                    System.out.println(" vaoww");

                } else if (sayaç<=8) {
                    System.out.println(" aferin");
                }else {
                    System.out.println(" başarısız");

                }
                break;
            } else if (tahmin<tutulanSayı) {
                System.out.println("sayıyı büyült");
                sayaç++;

            }else {
                System.out.println("sayıyı küçült");
                sayaç++;
            }
        }



    }
}
