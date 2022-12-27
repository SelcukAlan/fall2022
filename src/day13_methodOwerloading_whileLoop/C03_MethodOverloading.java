package day13_methodOwerloading_whileLoop;

public class C03_MethodOverloading {
    public static void main(String[] args) {

    toplama(5.4,6.3);// 11.7

    toplama('a','b');//

        //ilk olarak %100 uyumlu parametreler arar
        //%100 uyumlu yoksa çalışabilecek method var mı diye kontrol eder
        //çalışacak method birden fazla olursa min casting yaparak tercih yapar

        toplama(8.4,6);//

    }


    public static void toplama(int sayi2, double sayi1){
        System.out.println("int ve double toplami :" + (sayi1+sayi2));
    }

    public static void toplama(double sayi1, double sayi2){
        System.out.println("2 double sayi toplami :" + (sayi1+sayi2));
    }

}
