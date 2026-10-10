import java.util.Scanner;

public class gratisOngkir {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan total belanja");
        double total_belanja = inputan.nextDouble();

        if (total_belanja >= 100000.0) {
            double gratis_ongkir = 5000.0;
            double total_bayar = total_belanja - gratis_ongkir;
            System.out.println("Total belanja setelah mendapatkan gratis ongkir: " + total_bayar);
        } else {
            System.out.println("Total belanja tidak mencukupi untuk gratis ongkir");
        }
        inputan.close();
    }
}