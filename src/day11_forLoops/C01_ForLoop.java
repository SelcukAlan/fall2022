package day11_forLoops;

import java.util.Scanner;

public class C01_ForLoop {
    public static void main(String[] args) {
        //Kullanıcıdan bir char alıp o karakterden sonra gelen 10 karakteri yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char girilenKarakter=scan.next().charAt(0);

        for (int i = 1; i <=10; i++) {
            System.out.println((char) (girilenKarakter+i) + "  ");
        }
    }
}
