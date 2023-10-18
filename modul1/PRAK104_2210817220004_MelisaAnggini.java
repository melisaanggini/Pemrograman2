package modul2;

import java.util.Scanner;

public class PRAK104_2210817220004_MelisaAnggini {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Tangan Abu : ");
        String inputanAbu = inputan.nextLine().toUpperCase();
        System.out.print("Tangan Bagas : ");
        String inputanBagas = inputan.nextLine().toUpperCase();

        int poinAbu = 0;
        int poinBagas = 0;
        int i = 0;

        while (i <= inputanAbu.length()) {
            if (inputanAbu.charAt(i) == 'G' && inputanBagas.charAt(i) == 'B' ||
                    inputanAbu.charAt(i) == 'K' && inputanBagas.charAt(i) == 'G' ||
                    inputanAbu.charAt(i) == 'B' && inputanBagas.charAt(i) == 'K') {
                poinBagas++;
            } else if (inputanAbu.charAt(i) == 'B' && inputanBagas.charAt(i) == 'G' ||
                    inputanAbu.charAt(i) == 'G' && inputanBagas.charAt(i) == 'K' ||
                    inputanAbu.charAt(i) == 'K' && inputanBagas.charAt(i) == 'B') {
                poinAbu++;
            }
            i += 2;
        }
        if (poinAbu > poinBagas) {
            System.out.println("Abu");
        } else if (poinBagas > poinAbu) {
            System.out.println("Bagas");
        } else if (poinBagas == poinAbu) {
            System.out.println("Seri");
        }
    }
}
