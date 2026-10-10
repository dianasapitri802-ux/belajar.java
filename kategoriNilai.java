import java.util.Scanner;

public class kategoriNilai {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan nilai");
        double nilai = inputan.nextDouble();

        if (nilai >= 80) {
            System.out.println("A");
        } else if (nilai >= 70) {
            System.out.println("B");
        } else if (nilai >= 60) {
            System.out.println("C");
        } else if (nilai >=50){
            System.out.println("D");
        } else {
            System.out.println("E");
        }
        inputan.close();
    }
}