package day04_ıncrement_Concetenation;

public class C01_Pre_Postincrement {
    public static void main(String[] args) {

        int sayı=20;

        //sayıyı 3 artırın

        sayı=sayı+3;

        sayı+=3;

        sayı++;
        sayı++;
        sayı++;//3 farklı yolla artırabiliriz

        System.out.println(sayı);//29

        //sayının değerini iki azaltın

        sayı=sayı-2;
        sayı-=2;
        System.out.println(sayı);//25

        sayı=10;
        //sayının değerini önce 1 azaltın sonra artırın

        sayı--;//9
        System.out.println(sayı);//9

        sayı=10;

        //sayıyı önce yazdırın sonra 1 azaltın

        System.out.println(sayı);//10

        sayı--;//9

        System.out.println(sayı);//sayının son değeri 9 olur.

        sayı=10;
        sayı++;//sayıyı bir artırır
        ++sayı;//sayıyı bir artırır
        System.out.println(sayı);//12



        sayı=10;
        System.out.println(sayı++);//10 önce yazdırdık

        // java aynı satırda iki ,şlem olduğundan sıralama yapar
        //eğer ++ variableden sonra ise artırma işlemini sonra yapar
        //bu durumda önce yazdırma sonra artırma işlemi yapar

        System.out.println(sayı);//11 sonra atadık


        sayı=10;
        System.out.println(++sayı);//11 önce artırdı
        //++ variableden önce ise artırma işlemini önce yapar
        //bu durumda java önce artırma sonra yazdırma işlemi yapar

        System.out.println(sayı);//11 sonra yazdırdı















    }
}
