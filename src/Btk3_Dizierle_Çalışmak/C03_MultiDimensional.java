package Btk3_Dizierle_Çalışmak;

public class C03_MultiDimensional {

    public static void main(String[] args) {

        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "istanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Bilecik";

        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";

        sehirler[2][0] = "Erzurum";
        sehirler[2][1] = "Erzincan";
        sehirler[2][2] = "Agrı";

        for (int i = 0; i <= 2; i++) {
            System.out.println("----------");
            for (int j = 0; j <= 2; j++) {
                System.out.println(sehirler[i][j]);
            }
        }

    }
}
