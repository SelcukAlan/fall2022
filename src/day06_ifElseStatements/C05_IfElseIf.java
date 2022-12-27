package day06_ifElseStatements;

import java.util.Scanner;

public class C05_IfElseIf {
    public static void main(String[] args) {

        //Kullanıcıdan notunu alınız
        // 85 ve üzeri ise AA
        //65 üstü ise BB
        //50 ve üstü ise CC
        // geriye kalanlar CC
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double not=scan.nextDouble();

        if (not<0 || not>100){
            System.out.println("Geçersiz not");
        } else if (not>=85) {
            System.out.println("Notunuz AA");

        } else if (not>=65) {
            System.out.println("Notunuz BB");

        } else if (not>=50) {
            System.out.println("Notunuz CC");

        }else {
            System.out.println("Notunuz DD kaldınız");
        }


    }
}
