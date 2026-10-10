import java.util.Scanner;

public class loginSederhana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    String username = "admin";
    String password = "12345";

    System.out.print("Masukkan username: ");
    String inputUsername = scanner.nextLine();

    System.out.print("Masukkan password: ");
    String inputPassword = scanner.nextLine();

    if (inputUsername.equals(username) && inputPassword.equals(password)) {
        System.out.println("Login berhasil");
    } else {
        System.out.println("Username atau password salah");
    }

    scanner.close();
    }
}