package Btk4_Stringlerle_Çalışmak;

public class C02_String {
    public static void main(String[] args) {

        String str = "Bugun hava çok güzel";


        String str2 = str.replace(' ', '-');//replace -->boşluk yerine'-' koyar
        System.out.println(str2);

        System.out.println(str2.substring(2));//2.indexten başlayarak yazar

        System.out.println(str2.substring(2, 8));//2.indexten başlayarak 8 e kadar yaz-->gun-ha

        System.out.println("----------");

        for (String kelime : str.split(" ")) {
            System.out.print(kelime);//Bugunhavaçokgüzel

        }
        System.out.println(" ");
        System.out.println("-----------");

        System.out.println(str.toLowerCase());//B(b)ugun hava çok güzel->Büyük harfleri Küçük harf e çevirdi
        System.out.println("-------");
        System.out.println(str.toUpperCase());//BUGUN HAVA ÇOK GÜZEL->Küçük harfleri Büyük harf e çevirdi

        String st = "    Nazilli  Aydın'ın İlçessidir      ";

        System.out.println("st = " + st);
        System.out.println("---------------");//st =     Nazilli  Aydın'ın İlçessidir

        System.out.println("st.trim() = " + st.trim());//st.trim() = Nazilli  Aydın'ın İlçessidir
    }
}
