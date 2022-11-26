package Döngülerle_Çalışmak;

public class DoWhile_Döngüsü {
    public static void main(String[] args) {

        int i = 1;
        do {
            System.out.print(i + ",");
            i++;

        } while (i < 10);

        System.out.println(" ");
        System.out.println("     *****  ");

        int j = 1;
        do {
            System.out.println("Tek sayılar=" + j);
            j += 2;
        } while (j < 10);

    }
}
