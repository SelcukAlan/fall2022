package day07_ternary_switchStatements;

public class C05_Ternary {
    public static void main(String[] args) {

        /*
        Ternary işleminin sonucunu yazdıracaksak boolean şartının true veya false olması durumunda datalar farklı
        data türünde olabilir.

        Ancak atama yapacaksak trur veya false durumunda olacağı değerler atacağim
        variable'ın data türüne uygun olmalıdır.

         */
        int sayı=2;

        System.out.println(sayı>10 ? "Büyük sayı": sayı+2);


    }
}
