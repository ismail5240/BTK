package Mini_Projeler_1;

public class C03_Proje_3 {
    public static void main(String[] args) {

        //Task: Mükemmel sayımı?--->Bölenlerinin sayı degerleri toplamı == sayı
        //6->1,2,3(bölenleri)->toplamları :6
        //28-->1,2,4,7(bölenleri)->toplamları:28

        int num = 5;
        int tplm = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                tplm = tplm + i;
            }
        }
        if (tplm == num) {
            System.out.println(num + "sayı Mükemmel sayıdır ");
        } else {
            System.out.println(num + ":Sayı Mükemmel sayı degildir");
        }

    }
}
