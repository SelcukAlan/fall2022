package day10_stringManipulation;

import java.util.Scanner;

public class C09_ForLoop {
    public static void main(String[] args) {
        //Kullanıcıdan başlangıç ve bitiş değerlerini alıp bu
        // sınırlar dahil olarak bu sayılar arasında 5'in katı olan sayıları yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen sayıların başlangıç  değerlerini giriniz");
        int başlangıç=scan.nextInt();
        System.out.println("Lütfen bitiş değerini giriniz");
        int bitiş=scan.nextInt();

        for (int i = başlangıç; i <=bitiş ; i++) {
            if (i%5==0){
                System.out.println(i+ "  ");
            }
        }
    }
}
