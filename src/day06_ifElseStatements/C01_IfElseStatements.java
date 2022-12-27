package day06_ifElseStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {

        //Kullanıcıdan bir üçgenin üç kenar uzunluğunu alın
        //üçgen eşkenar ise "Eşkenar Üçgen" yazdırın
        Scanner scan= new Scanner (System.in);
        System.out.println("lütfen üçgenin üç kenarını giriniz");
        int kenar1=scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();
        if (kenar1==kenar2 && kenar2==kenar3 && kenar1>=0){

            System.out.println("eşkenar üçgen");
        }else{
            System.out.println("eşkenar üçgen değil");
        }
        // if ile başalayan kod else ile bitiyorsa input un tüm değerlerini kapsar
        //mutlaka her kod için bir bady çalışır

        }

    }

