package day21_staticKeyword;

public class C02_PassByValue {
    public static void main(String[] args) {


        int fiyat=100;
        //Fiyat üzerinden %10 indirim yapıp, indirimli fiyatı döndüren bir method oluşturun

        System.out.println(indirimYap10(fiyat));//90

        System.out.println(fiyat);//100

        // Eger indirimli fiyatın kalıcı olarak etki etmesini istiyorsak
        //atama yaparız.
    }

    public static int indirimYap10(int fiyat){

        fiyat=fiyat*90/100;

        return fiyat;

    }
}
