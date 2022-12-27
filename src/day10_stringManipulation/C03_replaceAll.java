package day10_stringManipulation;

public class C03_replaceAll {
    public static void main(String[] args) {
        //bu metindeki sayılardan kurtulun
        String str="Ja1va 56Gu,zel-dir";

        System.out.println(str.replace("1","")
                .replace("5","").replace("6",""));//Java Gu,zel-dir


        str="Ja1va 56Gu,zel-dir";

        /*
        replace methodu zaten istenen değişikliği verilen özelliğe uyan değer için yapar

        eğer genellemeyi bütün sayıları, bütün space'leri,özel karakterleri gibi genişletmek istersek
        replace methodunun yerine replace all methodunu kullanırız.
        Java bu genellemeleri yazabilmemiz için (reguler expressions) ları tanımlamıştır
        \\d:bütün digit'ler
         */

        str=str.replaceAll("\\d","");//Java Gu,zel-dir
        System.out.println(str);

        //özel karakterlerden kurtulun
        //space de özel karakter olduğundan bu duruma space'nın yok olmaması için
        //önce space yerine metinde olmayan bir değer atayalım

        str=str.replace(" ","5");
       str=str.replaceAll("\\W","");//JavaGuzeldir
        str=str.replaceAll("5","");
        System.out.println(str);//JavaGuzeldir

    }
}
