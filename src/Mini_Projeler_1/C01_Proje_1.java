package Mini_Projeler_1;

public class C01_Proje_1 {
    public static void main(String[] args) {

        //Task : Asal mı ?

        int sayi = 1;

        boolean asal = true;
        if (sayi < 2) {
            System.out.println("Geçersiz sayı");
            return;
        }

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asal = false;
            }

        }
        if (asal) {
            System.out.println("Sayı Asaldır:" + sayi);
        } else {
            System.out.println("Sayı Asal degildir");
        }
    }
}
