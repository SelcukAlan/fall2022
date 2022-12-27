package day07_ternary_switchStatements;

public class C11_SwitchStatements {
    public static void main(String[] args) {

        //Kullanicidan ISTQB kisaltmasindan hangi harfin anlamini ogrenmek istedigini alin
        // ve girilen harfin karsiligini yazdirin.
        // I : International S : Software T : Testing Q : Qualifications B: Board

        char harf='ı';

        switch (harf){
            case 'I':
            case 'ı':
                System.out.println("International");
                break;
            case 'S':
            case 's':
                System.out.println("Sofware");
                break;

            case 'Q':
            case 'q':
                System.out.println("Qualification");
                break;
            case 'B':
            case 'b':
                System.out.println("Board");
                break;
            default:
                System.out.println("Yanlış harf seçtiniz");


        }



    }
}
