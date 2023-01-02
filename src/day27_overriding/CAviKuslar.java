package day27_overriding;

public class CAviKuslar extends BKuslar{

    protected void hareket( ){
        System.out.println("ucarlar");
    }
    protected void beslenme( ) {
        System.out.println("et yerler");
    }
    protected void pence( ) {
        System.out.println("pencelidir");
    }
    protected void gaga( ) {
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {

        CAviKuslar krt1=new CAviKuslar();

        krt1.hareket();// c ucarlar
        krt1.beslenme();// c  et yerler
        krt1.pence();// c pencelidir
        krt1.gaga();// c sivri gagali
        krt1.kanat();// b kanatlidirlar
        krt1.solunum();// b akcigerle nefes alirlar
        krt1.cogalma();// b yumurtayla cogalirlar
        krt1.omur();// a yasar ve olurler


        BKuslar krt2=new CAviKuslar();

        krt2.hareket();// c ucarlar
        krt2.beslenme();// c  et yerler
        //krt2.pence();// BKuslar veya parent class'da yok CTE verir.
        krt2.gaga();// c sivri gagali
        krt2.kanat();// b kanatlidirlar
        krt2.solunum();// b akcigerle nefes alirlar
        krt2.cogalma();// b yumurtayla cogalirlar
        krt2.omur();// a yasar ve olurler

        AHayvanlar krt3=new CAviKuslar();

        krt3.hareket();// c ucarlar
        krt3.beslenme();// c  et yerler
       //krt3.pence();// AHayvanlarda yok, CTE
       //krt3.gaga();// AHayvanlarda yok, CTE
       //krt3.kanat();// AHayvanlarda yok, CTE
        krt3.solunum();// b akcigerle nefes alirlar
        krt3.cogalma();// b yumurtayla cogalirlar
        krt3.omur();// a yasar ve olurler

    }
}






