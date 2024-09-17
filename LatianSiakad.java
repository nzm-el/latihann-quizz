import java.util.Scanner;
public class LatianSiakad {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

        System.out.print("Masukan Nama: ");
        nama = sc.nextLine();
        System.out.print("Masukan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukan Kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukan Nama Absen: ");
        absen = sc.nextByte();

        System.out.print("Masukan Nilai Kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukan Nilai Tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukan Nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukan Nilai UAS: ");
        nilaiUAS = sc.nextDouble();
        System.out.print("Masukan Nilai Akhir: ");
        nilaiAkhir = sc.nextDouble();

        nilaiAkhir = (nilaiKuis*0.15) + (nilaiTugas*0.15) + (nilaiUTS*0.20) + (nilaiUAS*0.20);

        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: "+ nilaiAkhir);
    }
}
