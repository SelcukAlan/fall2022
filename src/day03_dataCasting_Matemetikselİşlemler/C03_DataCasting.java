package day03_dataCasting_Matemetikselİşlemler;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

        System.out.println( 228/5);//45

        System.out.println( 22/5);//4
        //java bir bölme işleminde 2 int işleme giriyorsa sonucu int olarak verir

        int sayı1=25;
        int sayı2=6;
        System.out.println(sayı1/sayı2);//4

        //Kullanıcıdan iki tamsayı alın birinci tam sayıyı ikinciye bölüp sonucu ondalık olarak yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen iki tam sayı giriniz");
        int sayı3=scan.nextInt();
        int sayı4=scan.nextInt();

        System.out.println("iki sayının bölme sonucu:"+(double)sayı3/sayı4);


    }
}
