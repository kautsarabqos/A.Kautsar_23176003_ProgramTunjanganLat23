import java.util.Scanner;

public class NilaiTerbesarTerkecil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Petugas: ");
        String petugas = scanner.nextLine();
        
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa: ");
        int banyaknyaNilai = scanner.nextInt();
        
        double[] nilaiMahasiswa = new double[banyaknyaNilai];
        
        // Mengumpulkan nilai mahasiswa
        for (int i = 0; i < banyaknyaNilai; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke - " + (i + 1) + ": ");
            nilaiMahasiswa[i] = scanner.nextDouble();
        }
        
        // Menampilkan hasil nilai mahasiswa
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.printf("Nilai Mahasiswa Ke - %d = %.2f%n", (i + 1), nilaiMahasiswa[i]);
        }
        
        // Menghitung nilai terbesar dan terkecil
        double nilaiTerbesar = nilaiMahasiswa[0];
        double nilaiTerkecil = nilaiMahasiswa[0];
        
        for (double nilai : nilaiMahasiswa) {
            if (nilai > nilaiTerbesar) {
                nilaiTerbesar = nilai;
            }
            if (nilai < nilaiTerkecil) {
                nilaiTerkecil = nilai;
            }
        }
        
        // Menampilkan hasil nilai terbesar dan terkecil
        System.out.printf("Nilai Terbesar adalah %.2f%n", nilaiTerbesar);
        System.out.printf("Nilai Terkecil adalah %.2f%n", nilaiTerkecil);
        System.out.println("Petugas: " + petugas);
        
        scanner.close();
    }
}