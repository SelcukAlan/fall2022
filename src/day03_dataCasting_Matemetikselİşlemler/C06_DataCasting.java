package day03_dataCasting_Matemetikselİşlemler;

import java.util.Scanner;

public class C06_DataCasting {
    public static void main(String[] args) {
        //Kullanıcıdan bir double bir tam sayı alın double
        // sayıya bölün bölüm işleminin sonucunun tam sayı kısmını yadırın


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir ondalikli sayi giriniz");
        double sayiDbl= scan.nextDouble();
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayiInt= scan.nextInt();
        System.out.println((int)(sayiDbl/sayiInt)); // sonucu double olarak yazdirir

    }
}
