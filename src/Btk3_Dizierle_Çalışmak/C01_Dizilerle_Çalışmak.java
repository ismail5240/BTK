package Btk3_Dizierle_Çalışmak;

public class C01_Dizilerle_Çalışmak {
    public static void main(String[] args) {

                 // Amele kod

        String str1 = "ismail";
        String str2 = "adem";
        String str3 = "murat";

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);

        String[] strDizi = new String[4];
        strDizi[0] = "ismail";
        strDizi[1] = "adem";
        strDizi[2] = "murat";
        strDizi[3] = "sümeyra";

        System.out.println("   *******  ");  // For 1. yol

        for (int i = 0; i < strDizi.length; i++) {
            System.out.println("strDizi = " + strDizi[i]);
        }

        System.out.println("------------"); // for 2.yol

        for (String strDizii : strDizi) {
            System.out.println(strDizii);
        }
    }
}
