import java.util.Scanner;
public class LatihanTagihan {
    public static void main(String[] args) {
    final int TARIF_PER_KWH = 1500;
    final int BATAS_PENGGUNAAN = 500;

    Scanner input = new Scanner(System.in);
    System.out.print("Masukan Jumlah Penggunaan Listrik (kwh): ");
    double penggunaanListrik = input.nextDouble();
    boolean melebihiBatas = penggunaanListrik > BATAS_PENGGUNAAN;
    double tagihanListrik = penggunaanListrik * TARIF_PER_KWH;

    System.out.println("Total Tagihan Listrik: Rp " + tagihanListrik);
    System.out.println("Penggunaan Listrik Melebihi Batas: " + melebihiBatas);

    }
}
