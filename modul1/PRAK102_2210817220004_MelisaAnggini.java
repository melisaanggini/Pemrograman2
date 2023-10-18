package modul2;

import java.util.Scanner;

public class PRAK102_2210817220004_MelisaAnggini {
    public static void main(String[] args) {
        // Deklarasi
        int inputUser, i = 1;

        // Input User
        Scanner keyboard = new Scanner(System.in);

        inputUser = keyboard.nextInt();
        int cek1 = inputUser;

        // Masuk Perulangan
        while(i <= 11){

            // Jika awal inputUser habis dibagi 5, maka
            if(inputUser % 5 == 0) {
                System.out.print((inputUser / 5) - 1);
                inputUser += 1;
                // Jika awal inputUser tidak habis dibagi 2, maka
            } else {
                System.out.print(inputUser);
                inputUser += 1;
            }
            // Buat koma
            if(i < 11) {
                System.out.print(", ");
            }
            i = i + 1;
        }
        System.out.println("");
    }
}
