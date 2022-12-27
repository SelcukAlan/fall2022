package day07_ternary_switchStatements;

public class C07_NestedTernary {
    public static void main(String[] args) {

        //Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
        // Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin

        int sayı=23;

        //System.out.println(sayı>0 ? "sayı pozitif": "sayı pozitif değil");

        System.out.println(sayı>0
                           ?
                           sayı%2==0 ? "çift sayı": "tek sayı"
                            :
                           -100>=sayı && sayı>=999 ? "üç basamaklı": "üç basamaklı değil"
                           );




    }
}
