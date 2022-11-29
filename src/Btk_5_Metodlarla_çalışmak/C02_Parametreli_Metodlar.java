package Btk_5_Metodlarla_çalışmak;

public class C02_Parametreli_Metodlar {


    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
       String yeniMesaj= mesaj.substring(0, 2);// Substring bir deger döndürüyor
        System.out.println("yeniMesaj = " + yeniMesaj);

        //-->int sayi=topla(5,7);//33. satır parametresiz oldugundan CTE VERİR

        int sayi=topla(5,7);//33. satır parametreli yapıldı
        System.out.println("sayi = " + sayi);
    }

    public static void ekle() {
        System.out.println("Eklendi");

    }

    public static void sil() {
        System.out.println("Silindi");

    }

    public static void güncelle() {
        System.out.println("Güncellendi");


    }

    public static int topla(int sayi1,int sayi2){
        return sayi1 + sayi2;

    }
}
