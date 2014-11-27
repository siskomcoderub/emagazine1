package pemdas2;

/**
 *
 * @author $Hernanda Cahyo Kurniawan
 * @twitter @NandackCahyo
 */
import java.util.Scanner;
public class ArrayMatrix {
    public static void main(String[] args) {
        int m,n,p;
        m=n=p=3;
        int[][] matA = new int[m][n];
        int[][] matB = new int[n][p];
        
        Scanner input = new Scanner(System.in);
        System.out.println("Matrik A : " + m + "x" + n);
        for (int i=0; i<matA.length; i++) {
            for (int j=0; j<matA[i].length; j++) {
                System.out.print("Masukkan nilai matA["+i+"]["+j+"] : ");
                matA[i][j] = input.nextInt();
            }
        }
        for (int i=0; i<matA.length; i++) {
            for (int j=0; j<matA[i].length; j++) {
                System.out.print(matA[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i=0; i<matB.length; i++) {
            for (int j=0; j<matB[i].length; j++) {
                System.out.print("Masukkan nilai matB["+i+"]["+j+"] : ");
                matB[i][j] = input.nextInt();
            }
        }
        for (int i=0; i<matB.length; i++) {
            for (int j=0; j<matB[i].length; j++) {
                System.out.print(matB[i][j] + "\t");
            }
            System.out.println();
        }
        
        int[][] matC = new int[matA.length][matB.length];
        System.out.println("Matrik C = Matrik A x Matrik B");
        System.out.println("Hasil Matrik C : " + m + "x" + p);
        for (int i=0; i<matC.length; i++) {
            for (int j=0; j<matC[0].length; j++) {
                for (int k=0; k<matA[0].length; k++) {
                    matC[i][j] += matA[i][k] * matB[k][j];
                }
                System.out.print(matC[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
