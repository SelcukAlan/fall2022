package day05_ifStatements;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {

        //Kullanıcıdan bir sayı alıp pozitif ise pozitif sayı,
        //100 ile 999 arasında ise(sınırlar dahil) pozitif üç basamaklı sayı,
        //3 ile bölünebiliyorsa 3 'ün katı
        //birler basamağı 7 ise "mükemmel" seçeneklerinden uygun olanları yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir tamsayı giriniz");
        int sayı=scan.nextInt();

        if (sayı>0){
            System.out.println("pozitif tamsayıdır");
        }

        if (sayı>=100 && sayı<=999){
            System.out.println("sayı 3 basamaklı pozitif tamsayı");
        }
        if (sayı%3==0){
            System.out.println("sayı üç'ün tam katıdır");
        }
        if (sayı%10==7){
            System.out.println("mükemmel");

        }


    }
}
