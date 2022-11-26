package Dizierle_Çalışmak;

public class ReCapp {
    public static void main(String[] args) {

        double[] myList = {1.2, 5.6, 3.4, 6.3};
        double total = 0;
        double max = myList[0];
        double min = myList[0];

        for (double num : myList) {
            if (num > max) {
                max = num;
            }

            total = total + num;
            System.out.println("num:" + num);
        }
        System.out.println("-----------------");
        System.out.println("toplam = " + total);
        System.out.println("---------------");
        System.out.println("max = " + max);

        System.out.println("---------------");
        for (double num : myList) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("min = " + min);

    }
}
