package Dosyalarla_Çalışmak;

import java.io.File;
import java.io.IOException;

public class C01_Dosyalarla_çalışmak {
    public static void main(String[] args) {

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
}
