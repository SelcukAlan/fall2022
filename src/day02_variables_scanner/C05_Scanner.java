package day02_variables_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        //Kullanıcıdan ismini alın ve girilen ismi büyük harfle yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");

        String girilenİsim=scan.nextLine().toUpperCase();

        System.out.println(girilenİsim);
    }
}
