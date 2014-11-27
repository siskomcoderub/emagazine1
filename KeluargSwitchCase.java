package pemdas2;

/**
 *
 * @author Hernanda Cahyo Kurniawan
 */
import java.util.Scanner;
public class KeluargSwitchCase {
    public static void main(String[] args) {
        Scanner dataIn = new Scanner(System.in);
        
        int anak;
        String gelar;
        System.out.println("Masukkan jumlah anak : ");
        anak = dataIn.nextInt();
        
        switch(anak) {
            case 0: gelar = "sepi";
                System.out.println("Keluarga " + gelar);
                break;
            case 1: gelar = "kecil";
                System.out.println("Keluarga " + gelar);
                break;
            case 2: gelar = "berencana";
                System.out.println("Keluarga " + gelar);
                break;
            case 3: gelar = "besar";
                System.out.println("Keluarga " + gelar);
                break;
            case 4: gelar = "ramai";
                System.out.println("Keluarga " + gelar);
                break;
            default: 
                gelar = "Keluargamu banyak juga ya!";
                System.out.println(gelar);
        }
    }
}
