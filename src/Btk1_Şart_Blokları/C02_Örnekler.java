package Btk1_Şart_Blokları;

public class C02_Örnekler {
    public static void main(String[] args) {

        int a = 4;
        int b = 25;
        int c = 3;
        int enbüyük = a;// Kurs çözümü

        // task-> enbüyük sayıyı create eden code print ediniz

        if (a < b) {
            if (c < b) {
                System.out.println("en büyük sayı:" + b);
            } else if (a < c) {
                if (b < c) {
                    System.out.println("en büyük sayı:" + c);
                }
            }
        } else {
            System.out.println("en büyük sayı:" + a);
        }

        // 2. yol

        if (a < b && c < b) {
            System.out.println("2.yol en büyük sayı:" + b);
        } else if (b < c && a < c) {
            System.out.println("2.yol en büyük sayı:" + c);
        } else {
            System.out.println("2.yol en büyük sayı:" + a);
        }
        // 3.yol --> kurs çözümü

        if (enbüyük < b) {
            enbüyük = b;
        }
        if ((enbüyük < c)) {
            enbüyük = c;

        }
        System.out.println("enbüyük = " + enbüyük);
    }
}
