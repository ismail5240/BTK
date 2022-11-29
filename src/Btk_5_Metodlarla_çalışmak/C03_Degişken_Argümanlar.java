package Btk_5_Metodlarla_çalışmak;

public class C03_Degişken_Argümanlar {

    public static void main(String[] args) {

        int toplam = topla(2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("toplam = " + toplam);

    }

    public static int topla(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }
}
