package day05_ifStatements;

import java.util.Scanner;

public class C01_IfStatements {
    public static void main(String[] args) {

        //Öğrenciden notunu rakam olarak alın harf olarak yazdırın
        // 0-49,99: FF
        // 50,64,999: CC
        // 65,84,999:BB
        // 85,100: AA

        Scanner scan=new Scanner( System.in);
        System.out.println("lütfen notunuzu giriniz");
        double not=scan.nextDouble();

        if (0<=not && not<50){
            System.out.println("notunuz DD, malesef kaldınız");
        }

        if (50<=not && not<65){
            System.out.println(" notunuz CC  tebrikler geçtiniz");
        }
        if (65<=not && not<85){
            System.out.println("notunuz BB tebrikler geçtiniz");
        }
        if (85<=not && not<=100){
            System.out.println("Tebrikler notunuz AA");
        }
    }
}
