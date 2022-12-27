package day02_variables_scanner;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {

        //Kullanıcıdan bir dikdörtgenin iki kenar uzunlığunu alıp dikdörtgrnin alanını yazdırın

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen dikdörtgenin iki kenar uzunluğunu giriniz");

        double kenar1=scan.nextDouble();

        double kenar2=scan.nextDouble();

        System.out.println("Dikdörtgenin alanı:"+kenar1*kenar2);

    }
}
