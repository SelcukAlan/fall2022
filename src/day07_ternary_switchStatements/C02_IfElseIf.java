package day07_ternary_switchStatements;

import java.util.Scanner;

public class C02_IfElseIf {
    public static void main(String[] args) {

        //Kullanıcıdan bir tamsayı alın sayı rakam ise "girilen sayı rakam"
        //sayı iki basamaklı ise "girilen sayı iki basamakı"
        //sayı iki basamaktan büyükse "büyük sayı yazdırın"

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
        int giriliensayı=scan.nextInt();

        if (giriliensayı<0) System.out.println("Negatif sayı");
        else if (giriliensayı<=9) System.out.println("Girilen sayı rakam");
        else if (giriliensayı<=99) System.out.println("Girilen sayı iki basamaklı");
        else System.out.println("Büyük sayı");


        }

    }


