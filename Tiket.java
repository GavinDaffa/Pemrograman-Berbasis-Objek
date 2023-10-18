import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tiket {
    private String username;
    private String password;

    public Tiket() {
        username = "admin";
        password = "123";
    }

    public boolean doLogin() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Masukkan username: ");
            String inputUsername = reader.readLine();
            System.out.print("Masukkan password: ");
            String inputPassword = reader.readLine();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("Login berhasil.");
                return true;
            } else {
                System.out.println("Login gagal.");
                return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Anda dapat menambahkan method lainnya yang diperlukan di sini
}
