package day07_ternary_switchStatements;

import java.util.Scanner;

public class C01_IfElseIf {
    public static void main(String[] args) {

        //Kullanıcıdan bir tamsayı alın sayı rakam ise "girilen sayı rakam"
        //sayı iki basamaklı ise "girilen sayı iki basamakı"
        //sayı iki basamaktan büyükse "büyük sayı yazdırın"


        /*




         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
        int giriliensayı=scan.nextInt();

        if (giriliensayı>=0 && giriliensayı<=9) System.out.println("Girilen sayı rakam");

        else if (giriliensayı>=10 && giriliensayı<=99) System.out.println("Girilen sayı iki basamaklı");

        else if (giriliensayı>=100) System.out.println("Büyük sayı");

        }


    }

