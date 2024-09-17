import java.util.Scanner;
public class LatihanGaji {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Jummlah Jam Kerja: ");
        double upahPerJam = scanner.nextDouble();
        System.out.print("Masukan Upah PerJam: ");
        double gajiKotor = scanner.nextDouble();

        double bonus = gajiKotor * 0.10;
        double gajiSetelahBonus = gajiKotor + bonus;
        double pajak = gajiSetelahBonus * 0.05;
        double gajiBersih = gajiSetelahBonus - pajak;

        System.out.println("Rincian Gaji BUlanan: ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Gaji Kotor: "+ gajiKotor);
        System.out.println("Bonus: " + bonus);
        System.out.println("Gaji Setelah Bonus: " + gajiSetelahBonus);
        System.out.println("Pajak: " + pajak);
        System.out.println("Gaji Bersih: " + gajiBersih);

    }
}
