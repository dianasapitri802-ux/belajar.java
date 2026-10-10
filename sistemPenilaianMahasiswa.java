import java.util.Scanner;

public class sistemPenilaianMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        double nilai = scanner.nextDouble();

        System.out.print("Masukkan persentase kehadiran: ");
        double kehadiran = scanner.nextDouble();

        System.out.print("Masukkan persentase tugas selesai: ");
        double tugas = scanner.nextDouble();

        if (nilai >= 60 && kehadiran >= 75 && tugas >= 80) {
            System.out.println("LULUS");
        } else {
            System.out.println("TIDAK LULUS");
        }

        scanner.close();
    }
}