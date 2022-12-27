package day02_variables_scanner;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {
        // Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Lütfen bir tamsayı giriniz");

        int tamsayı=scan.nextInt();

        System.out.println("Lütfen bir ondalıklı sayı giriniz");

        double ondalıklıSayı=scan.nextDouble();

        System.out.println("toplam:"+tamsayı+ondalıklıSayı+
                          "\nçarpım:"+tamsayı*ondalıklıSayı);

    }
}
