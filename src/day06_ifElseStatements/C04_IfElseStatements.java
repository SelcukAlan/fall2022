package day06_ifElseStatements;

import java.awt.image.Kernel;
import java.util.Scanner;

public class C04_IfElseStatements {
    public static void main(String[] args) {
        //Kullanicidan bir karakter girmesini isteyin, girilen karakterin buyuk harf olup olmadigini yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char krk=scan.next().charAt(0);
        if (krk>='A'&& krk<='Z'){
            System.out.println("Büyük harf");
        }else {
            System.out.println("Büyük harf değil");
        }
    }
}
