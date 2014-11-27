package emag1;

/**
 *
 * @author $Hernanda Cahyo Kurniawan @twitter @NandackCahyo
 *
 * game sederhana tebak angka (lebih besar, lebih kecil atau sama dengan)
 * jika lebih besar / lebih kecil dan benar maka nilai+1 
 * jika salah maka nyawa-1;
 * jika sama dengan dan benar maka nilai +3 
 * jika salah maka nyawa-1; nyawa awal = 5 (untuk 5x menebak) 
 * jika menebak benar 3 kali berturut-turut maka nyawa+1 (extra) 
 * jika nyawa = 0 maka game selesai, tampilkan nilai
 *
 */
import java.util.Scanner;

public class TebakAngka {

    public static void main(String[] args) {
        // deklarasi variable untuk menerima input
        Scanner input = new Scanner(System.in);
        // variable utama
        int tebakan, extra, nilai, nyawa;
        double angkaAwal, angkaBaru;
        String status;
        nyawa = 5;
        nilai = 0;
        extra = 0;

        System.out.println("Selamat datang di game Tebak Angka SCUB!");

        while (nyawa > 0) {
            // mengisi angka awal secara acak untuk angkaAwal dan angkaBaru
            angkaAwal = Math.random() * 10; // mengeluarkan angka aca
            angkaAwal = (int) angkaAwal; // proses casting tipe data
            angkaBaru = Math.random() * 10; // mengeluarkan angka acak
            angkaBaru = (int) angkaBaru; // proses casting tipe data
            
            // tampilan utama
            System.out.println("========================");
            System.out.println("Nyawa anda : " + nyawa);
            System.out.println("Nilai yang anda kumpulkan : " + nilai);
            System.out.println("");
            System.out.printf("Angka awal = %2.0f", angkaAwal);
            System.out.println("");
            // tampilan untuk opsi pilihan
            System.out.println("Pilihan : ");
            System.out.println("1 : Lebih Kecil");
            System.out.println("2 : Sama Dengan");
            System.out.println("3 : Lebih Besar");
            System.out.println("Silahkan masukkan angka sesuai pilihan diatas : ");
            tebakan = input.nextInt(); // input dari user untuk angkaPemain

            // memulai menbandingkan jawaban

            if (angkaBaru < angkaAwal) {
                status = "Lebih Kecil"; // jika angkaBaru < angkaAwal
            } else if (angkaBaru == angkaAwal) {
                status = "Sama Dengan"; // jika angkaBaru = angkaAwal
            } else {
                status = "Lebih Besar"; // jika angkaBaru > angkaAwal
            }
            
            // mendapatkan proses berikutnya sesuai dengan input tebakan user
            switch (tebakan) {
                case 1: // jika Lebih Kecil
                    if ("Lebih Kecil".equals(status)) { // status lebih kecil
                        ++nilai; // nilai + 1
                    } else {
                        --nyawa; // nyawa - 1
                    }
                    break;
                case 2: // jika Lebih Kecil
                    if ("Sama Dengan".equals(status)) { // status sama dengan
                        nilai = nilai + 3; // nilai + 3
                        ++extra; // extra + 1
                        // jika extra sudah lebih atau sama dengan 3
                        // maka nyawa + 1
                        if (extra >= 3) {
                            ++nyawa;
                            extra = 0; // mengembalikan extra menjadi 0
                        }
                    } else {
                        --nyawa;
                    }
                    break;
                case 3: // jika Lebih Kecil
                    if ("Lebih Besar".equals(status)) { // status lebih besar
                        ++nilai;
                    } else {
                        --nyawa;
                    }
                    break;
                default: // jika input pilihan tidak sesuai kembali ke awal
                    System.out.println("Anda salah memasukkan angka pilihan!");
            }
            System.out.printf("Angka awal = %2.0f", angkaAwal);
            System.out.println("");
            System.out.printf("Angka Baru = %2.0f", angkaBaru);
            System.out.println("");
            System.out.println("Tebakan yang benar : " + status);
            System.out.println("========================");
            System.out.println("");
        }

        System.out.println("Permainan Berakhir!");
        System.out.println("Total nilai yang anda dapatkan : " + nilai);
        System.out.println("Copyright : Hernanda Cahyo Kurniawan");
        System.out.println("SisKom Coder Universitas Brawijaya - 2014");
    }
}
