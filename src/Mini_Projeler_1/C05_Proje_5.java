package Mini_Projeler_1;

public class C05_Proje_5 {
    public static void main(String[] args) {

        //Task:Aranan sayı var mı yok mu

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
