package day05_ifStatements;

import java.util.Scanner;

public class C03_Soru {
    public static void main(String[] args) {

        // Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //ucgen eskenar ise "Eskenar ucgen" yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen üçgenin üç kenar uzunluğunu giriniz");

        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("eşkenar üçgen");

        }else {
            System.out.println("eşkenar üçgen degil");

        }



    }
}
