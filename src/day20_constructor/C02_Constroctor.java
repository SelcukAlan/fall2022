package day20_constructor;

public class C02_Constroctor {
    public static void main(String[] args) {

  /*
            Bir obje olusturulurken
            istedigimiz ozellikleri direk atayabilirsek
            sonradan tekrar bir atama islemi yapmama gerek kalmaz
            bu durumda atamayi tek tek bizim yapmamiz yerine
            constructor'in atama yapmasini istemeliyiz
            atama yapmak icin constructor'a parametre gondermeliyiz
         */
        karesiniYazdir(5); // 25
        karesiniYazdir(10); // 100
        Car car1=new Car("BMW","5.20",2020,15000,"Beyaz");
        /*
        Car{marka='BMW'
        , model='5.20'
        , yil=2020
        , km=15000
        , renk='Beyaz'}
         */
        System.out.println(car1);
        Car car2=new Car("Tofas","Sahin",2010);
        System.out.println(car2);
        /*
        Car{marka='Tofas'
        , model='Sahin'
        , yil=2010
        , km=0
        , renk='Renk secilmedi'}
         */
    }
    public static void karesiniYazdir(int sayi){
        System.out.println(sayi*sayi);

    }

}






