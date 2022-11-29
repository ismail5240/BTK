package Mini_Projeler_1;

public class C04_Proje_4 {
    public static void main(String[] args) {

        // Task: Arkdaş sayı mı
        // Arkadai sayı-->

        int sayi1 = 220;
        int sayi2 = 284;
        int toplam1 = 0;// 1,2,4,5,10,11,20,22,44,55,110-->284
        int toplam2 = 0;// 1,2,4,71,142-->220

        for (int i = 1; i < sayi1; i++) {
            if (sayi1 % i == 0) {
                toplam1 = toplam1 + i;

            }
        }
        for (int i = 1; i < sayi2; i++) {
            if (sayi2 % i == 0) {
                toplam2 = toplam2 + i;
            }
        }
        if (sayi1 == toplam2 && sayi2 == toplam1) {
            System.out.println("Bu iki sayı Arkadaş sayıdır");
        } else {
            System.out.println("Bu iki sayı Arkdaş sayı degildir");
        }
    }
}
