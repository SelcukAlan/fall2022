package day11_forLoops;

public class C03_AsalSayı {
    public static void main(String[] args) {

        // input olarak verilen bir tam sayının asal sayı olup olmadığını yazdırın

        int input=25;

        String sonuç="Sayı asal";

        for (int i = 2; i <input ; i++) {

            if (input%i==0)
                sonuç="Sayı asal değil";
                break;
                // Java bir loop'un içerisinde kod break görürs o loop'u bitirir

        }
        System.out.println(sonuç);
    }
}
