package soal1;

// Import Scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Instansiasi / Membuat Object
        Dadu dadu = new Dadu();

        // User input banyaknya jumlah dadu (e)
        int inputUser = input.nextInt();

        dadu.setInput(inputUser);

        dadu.acakNilai();
        dadu.cetakDadu();
    }
}
