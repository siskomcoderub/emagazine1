package pemdas2;

/**
 *
 * @author $Hernanda Cahyo Kurniawan
 * @twitter @NandackCahyo
 * user masukkan angka
 * looping untuk mencari setiap kolom dari setiap baris
 * jika ditemukan angka yang dicari maka tampilkan
 * jika dalam array tak ada angka yang dicari tampilkan sesuatu
 */
import java.util.Scanner;
public class ArrayCari {
    public static void main(String[] args) {
        int cari;
        boolean ketemu = false;
        int[][] angka = {{3,2,1,5},{4,1,2,6}};
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka yang dicari : ");
        cari = input.nextInt();
        System.out.println("Angka yang dicari : " + cari);
        for (int i=0; i<angka.length; i++) {
            for (int j=0; j<angka[i].length; j++) {
                if (cari == angka[i][j]) {
                    System.out.println("Angka " + cari + " ada di baris ke "
                            +i+" kolom ke "+j+"!");
                    ketemu = true;
                }
            }
        }
        // jika setelah looping tak ada satupun angka yang sama, pesan :
        if (!ketemu) {
            System.out.println("Angka yang anda cari ("+cari+") tidak ditemukan!");
        }
    }
}
