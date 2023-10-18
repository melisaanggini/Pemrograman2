package modul1;

import java.util.Scanner;

public class PRAK105_2210817220004_MelisaAnggini {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukan Makanan Favorit: ");
        String makananFavorit= userInput.next();
        System.out.print("Masukan Hobi: ");
        String hobi= userInput.next();

        System.out.println("Aku Suka Makan " +makananFavorit+ ", dan Hobiku " +hobi );

    }
}
