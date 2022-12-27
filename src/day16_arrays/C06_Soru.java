package day16_arrays;

public class C06_Soru {
    public static void main(String[] args) {

        //Bir marketin fiyatlarını tutan bir array var bu marketteki
        // en yüksek ve en düşük fiyatları yazdıran bir method yazdırın

        double[] fiyatlar={23, 34.5, 42.1, 5.7, 3.4, 23.5};
        enYüksekEnDüşükFiyatYazdır(fiyatlar);

    }

    public static void enYüksekEnDüşükFiyatYazdır(double[]fiyatlar){

        double enDüşükFiyat=fiyatlar[0];
        double enYüksekFiyat=fiyatlar[0];

        for (int i = 0; i <fiyatlar.length ; i++) {
            if (fiyatlar[i]<enDüşükFiyat){
                enYüksekFiyat=fiyatlar[i];

            }
            if (fiyatlar[i]>enYüksekFiyat){
                enYüksekFiyat=fiyatlar[i];

            }
        }
        System.out.println("Listedeki en düşük fiyat :" + enDüşükFiyat);
        System.out.println("listedeki en yüksek fiyat :"+enYüksekFiyat);




    }
}
