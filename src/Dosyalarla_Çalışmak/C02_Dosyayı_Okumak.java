package Dosyalarla_Çalışmak;

import java.io.File;
import java.io.IOException;

public class C02_Dosyayı_Okumak {
    public static void main(String[] args) {

        getfileinfo();


    }// main sonu

    public static void createfile() {

        File file = new File("C:\\Users\\ASUS\\IdeaProjects\\BTK\\file\\students.txt");

        try {

            if (file.createNewFile()) {

                System.out.println("Dosya oluşturuldu");
            } else {
                System.out.println("Dosya zaten mevcut");
            }

        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public static void getfileinfo() {
        File file = new File("C:\\Users\\ASUS\\IdeaProjects\\BTK\\file\\students.txt");
        if (file.exists()) {
            System.out.println("Dosya adı:" + file.getName());
            System.out.println("Dosya yolu:" + file.getAbsolutePath());
            System.out.println("Dosya yazılabilirmi:" + file.canWrite());
            System.out.println("Dosya okunabilirmi:" + file.canRead());
            System.out.println("Dosya boyutu(byte):" + file.length());
        } else {
            System.out.println("");
        }
    }
}
