package Btk_5_Metodlarla_çalışmak;

public class C01_Metodları_Anlamak {
    public static void main(String[] args) {

        sayiBulmaca();

    }
public static void sayiBulmaca(){
    int aranan = 11;
    boolean varmı = false;

    int[] sayilar = {1, 2, 3, 5, 7, 9, 0};

        for (int sayi : sayilar) {
        if (sayi == aranan) {
            varmı=true;
            break;
        }
    }
        if (varmı) {
        System.out.println("Sayı var");

    }else {
        System.out.println("Sayı yok");
    }
    //2. yol
      /*  for(int i=0; i<] i++) {
            aranan=i;
        }*/
        System.out.println(aranan);
}
}
