package Btk2_Döngülerle_Çalışmak;

public class C01_For_Döngüsü {
    public static void main(String[] args) {

        for (int i = 0; i <10; i++){
            System.out.print(" " + i);

        }
        System.out.println(" ");
        System.out.println("     *****");

        for (int i = 1; i < 10; i+=2){

            System.out.println(" tek sayılar= " + i);
        }
        System.out.println("     *****");
        for (int i = 2; i <= 10; i+=2){
            System.out.println("çift sayılar=" + i);
        }
    }


}
