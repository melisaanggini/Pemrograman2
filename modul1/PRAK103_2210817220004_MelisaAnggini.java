package modul2;

import java.util.Scanner;
public class PRAK103_2210817220004_MelisaAnggini {
    public static void main(String[] args) {
        // Deklarasi
        int inputUser, batasInput, i = 1;

        // Input User
        Scanner keyboard = new Scanner(System.in);

        batasInput = keyboard.nextInt();
        inputUser = keyboard.nextInt();

        int cek1 = inputUser;

//        System.out.println(inputUser);
//        System.out.println(batasInput);

        // Masuk Perulangan
        do {

            // Jika bilangan genap jangan tampilkan
            if(inputUser % 2 == 0) {
                inputUser += 1;
                // Jika bilangan ganjil tampilkan
            } else {
                System.out.print(inputUser);
                if( i < batasInput * 2 - 1 ) {
                    System.out.print(", ");
                }

                inputUser += 1;
            }
            i = i + 1;
        } while (i <= batasInput * 2);
        System.out.println("");
    }
}
