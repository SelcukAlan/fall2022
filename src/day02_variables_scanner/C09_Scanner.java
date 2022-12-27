package day02_variables_scanner;

import java.util.Scanner;

public class C09_Scanner {
    public static void main(String[] args) {

        // Kullanıcıdan iki sayı alın ikisinin değerlerini değiştirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen iki sayı giriniz");

        int sayı1=scan.nextInt();

        int sayı2=scan.nextInt();

        int temp;

        //1. adım sayı2 yi temp e atayalım

       temp=sayı2;
       //2. adım sayı1 değerini sayı2 ye atayalım

        sayı2=sayı1;

        //3. adım tepmdeki değeri sayı1 e atayalım

        sayı1=temp;
        System.out.println("sayıların yerlerini değiştirdim"
                +"\nsayı1 in yeni değeri:"
                +sayı1+"\nsayı2nin değeri:"+sayı2);









    }
}
