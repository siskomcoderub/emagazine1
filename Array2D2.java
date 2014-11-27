package pemdas2;

/**
 *
 * @author $Hernanda Cahyo Kurniawan
 * @twitter @NandackCahyo
 */
import java.util.Scanner;
public class Array2D2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] angka = new int[2][3];
        
        for (int i=0; i<angka.length; i++) {
            for (int j=0; j<angka[i].length; j++) {
                System.out.print("Masukkan angka["+i+"]["+j+"] : ");
                angka[i][j] = input.nextInt();
            }
        }
        
        
        for (int i=0; i<angka.length; i++) {
            for (int j=0; j<angka[i].length; j++) {
                System.out.print(angka[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
