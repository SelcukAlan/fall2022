package day06_ifElseStatements;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {
        //Kullanıcıdan bir üçgenin üç kenar uzunluğunu alın
        //üçgen ikizkenar ise "İkizkenar Üçgen" yazdırın değilse "İkizkenar değil yazdırın"
        Scanner scan= new Scanner (System.in);
        System.out.println("lütfen üçgenin üç kenarını giriniz");
        int kenar1=scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        if ((kenar1==kenar2 && kenar1!=kenar3 ) ||
           (kenar2==kenar3 && kenar2!=kenar1 ) ||
           ( kenar3==kenar1 && kenar3!=kenar2)){
            System.out.println("İkizkenar üçgen");
        }else {
            System.out.println("İkizkenar değil");
        }

    }
}
