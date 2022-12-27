package day11_forLoops;

public class C02_ForLoop {
    public static void main(String[] args) {

        //input olarak verilen bir String de indexi tek sayı olanları küçük harfle
        //indexi çift sayı olanları büyük harfle yazdırın
        // Örnek: Java output: JaVa

        String input="java candır, Selenium heyecandır";

        for (int i = 0; i < input.length(); i++) {


        System.out.print(i%2==0 ? input.substring(i,i+1).toUpperCase() :input.substring(i,i+1).toLowerCase());

        }



    }
}
