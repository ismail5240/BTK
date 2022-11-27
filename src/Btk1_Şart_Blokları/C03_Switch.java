package Btk1_Şart_Blokları;

public class C03_Switch {
    public static void main(String[] args) {

        char not1 = 'B';


        switch (not1) {
            case 'A':
                System.out.println("Mükemmel not:Geçtin");
                break;
            case 'B':
                System.out.println(" çok İyi not:Geçtin");
                break;
            case 'C':
                System.out.println("İdare eder not:Geçtin");
                break;
            case 'D':
                System.out.println("Kötü not:Bütünlemeye kaldım");
                break;
            case 'F':
                System.out.println("Çok kötü not:Kaldın");
                break;
            default :
                System.out.println("Geçersiz not girdin");
        }

    }
}
