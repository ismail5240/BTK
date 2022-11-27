package Btk1_Şart_Blokları;

public class C01_İf_Blokları {
    public static void main(String[] args) {

        int sayi = 19;
        int sayi2 = 20;
        int sayi3=15;

        if (sayi < 20) {
            System.out.println("sayı 20'den küçüktür ->sayi = " + sayi);
        }else {
            System.out.println("sayı 20 den küçük değildir");
        }
        System.out.println("---------");
        if (sayi2 < 20) {

            System.out.println("sayi2 = " + sayi2);//sayi2 20'den küçük olmadıgı için yazdırmadı
        }
        System.out.println("sayı 20'den küçük değildir");
        System.out.println("---------");

        if (sayi3 < 15) {
            System.out.println("sayı 15'den küçüktür ->sayi3 = " + sayi3);
        }else if(sayi3==15) {
            System.out.println("sayı3 15'e eşittir -->sayı3 ="+sayi3);
        }else{
            System.out.println("sayı 15 den Büyüktür");
        }
    }

}