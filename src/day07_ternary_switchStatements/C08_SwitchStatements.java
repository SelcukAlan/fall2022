package day07_ternary_switchStatements;

public class C08_SwitchStatements {
    public static void main(String[] args) {

        //Kullanıcıdan iki sayı alın ve kullanıcıya istediği işlemi sorun
        //+,-,*,/ işaretlerinden hangisini girerse iki sayı için o işlemi yapın
        //bu işaretlerden birini girmezse "yanlış işlem tercihi" yazdırın



        //İf ile yapalım

        int sayı1=20;
        int sayı2=10;

        char işlem ='*';

        if (işlem=='+'){
            System.out.println("Sayıların toplamı:"+(sayı1+sayı2));
        } else if (işlem=='-') {
           System.out.println("Sayıların farkı:"+(sayı1-sayı2));
        }else if (işlem=='*'){
            System.out.println("Sayıların çarpımı:"+(sayı1*sayı2));

        } else if (işlem=='/')  {
            System.out.println("Sayıların bölümü:"+(sayı1/sayı2));
        }else {
            System.out.println("Yanlış işlem yaptınız");
        }
        System.out.println("********");
        //Switch ile yapalım

        switch (işlem){
            case '+':
                System.out.println("Sayıların toplamı:"+(sayı1+sayı2));
                break;
            case '-':
                System.out.println("Sayıların farkı:"+(sayı1-sayı2));
                break;
            case  '*':
                System.out.println("Sayıların çarpımı:"+(sayı1*sayı2));
                break;
            case  '/':
                System.out.println("Sayıların bölümü:"+(sayı1/sayı2));
            default:
                System.out.println("Yanlış işlem yaptınız");// Break ile kesme yapmazsanız sonuna kadar yazdırır.

        }

    }
}
