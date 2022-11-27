package Btk4_Stringlerle_Çalışmak;

public class C01_String {
    public static void main(String[] args) {

        String str = "Bugun hava çok güzel";

        System.out.println("str = " + str);
        System.out.println("Eleman sayısı = " + str.length());
        System.out.println("5.Eleman sayısı = " + str.charAt(4));
        System.out.println(str.concat(" Yaşsın!"));
        System.out.println(str.startsWith("B"));
        System.out.println(str.endsWith("b"));

        char[] karakter=new char[6];
        str.getChars(0,5,karakter,0);
        System.out.println(karakter);

        System.out.println(str.indexOf("ç"));// Baştan(0.karakterden)başlar ve sayar->11.karakter
        System.out.println(str.lastIndexOf("g"));//Sondan başlar aranan karakteri bulu BAŞTAN sayarak gelir-->15.karakter


    }
}
