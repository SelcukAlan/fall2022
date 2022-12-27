package day14_doWhileLoop_scope;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        // Verilen başlangıç ve bitiş karakterleri dahil
        //aradaki tüm karakterleri yazdırın.

        char baslangıç='d';
        char bitiş='m';

        do {
            System.out.print(baslangıç);
            baslangıç=(char) (baslangıç+1);
        }while (baslangıç<=bitiş);


    }
}
