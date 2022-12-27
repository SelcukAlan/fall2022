package day06_ifElseStatements;

import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {
        //Kullanıcıdan bir harf isteyi girilen karakter küçük harf ise onu büyük harf yazdırın
        //yoksa harfi yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char harf =scan.next().toUpperCase().charAt(0);
        if (harf >='a'&& harf>='z'){
            System.out.println(harf);
        }else {
            System.out.println(harf);
        }

    }
}
