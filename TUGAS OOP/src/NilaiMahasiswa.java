import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Masukkan Nama Anda: ");
        String Nama = scanner.nextLine();

        System.out.print("Masukkan NIM Anda: ");
        Integer Nim = scanner.nextInt();
        
        System.out.print("Masukkan Nilai Tubes Anda: ");
        double NilaiTubes = scanner.nextDouble();

        System.out.print("Masukkan Nilai Quiz Anda: ");
        double NilaiQuiz  = scanner.nextDouble();

        System.out.print("Masukkan Nilai Tugas Anda: ");
        double NilaiTugas = scanner.nextDouble();

        System.out.print("Masukkan Nilai UTS Anda: ");
        double NilaiUTS = scanner.nextDouble();

        System.out.print("Masukkan Nilai UAS Anda: ");
        double NilaiUAS = scanner.nextDouble();

        Nilai Nilai = new Nilai();
        double NilaiAkhir = Nilai.NilaiAkhir(NilaiTubes, NilaiQuiz, NilaiTugas, NilaiUTS, NilaiUAS);
    
        System.out.println("Nama: " + Nama);
        System.out.println("NIM: " + Nim);
        System.out.println("Nilai matkul PBO Anda adalah:" + NilaiAkhir);

    
        scanner.close();
    }   
}
