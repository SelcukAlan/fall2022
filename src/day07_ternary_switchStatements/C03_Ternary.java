package day07_ternary_switchStatements;

public class C03_Ternary {
    public static void main(String[] args) {

        //input olarak verilen sayıyı kontrol edip sayı
        //çift ise "çift sayı"
        //değilse "tek sayı" yazdırın

        int input=33;

        // if else ile yapalim

        if (input%2==0){
            System.out.println("Çift sayı ");
        }else {
            System.out.println("Tek sayı");
        }

        //Ternary ile yapalım

        System.out.println(input%2==0 ? "Çift sayı":"Tek sayı");// Basit if else işlemleri kodlama imkanı verir.

        



    }
}
