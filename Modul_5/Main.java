import java.util.Scanner;

public class Main {
    static Peternakan bebek = new Peternakan("Bebek", "Telur Biasa", 15, "telur", 2, 2000, "butir");
    static Peternakan unta = new Peternakan("Unta", "Susu Putih", 3, "susu", 5, 60000, "liter");
    static Peternakan domba = new Peternakan("Domba", "Bulu Hitam", 4, "bulu", 4, 15000, "kg");
    static Scanner sc = new Scanner(System.in);
    final static double ppn = 0.1;

    public static void main(String[] args) {

        boolean active = true;
        while (active) {

            System.out.println("Menu:");
            System.out.println(
                    "1. Menampilkan Informasi Peternakan\n2. Menampilkan Total Pemasukan Harian\n3. Menampilkan Harga Setelah PPN\n4. Exit");
            System.out.print("\nMasukkan Menu Anda: ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    cetakInfo();
                    System.out.println("=".repeat(50));
                    break;
                case 2:
                    cetakPemasukkan();
                    break;
                case 3:
                    cetakPPN();
                    break;
                case 4:
                    active = false;
                    break;

                default:
                    System.out.println("=".repeat(50));
                    System.out.println("Pilihan tidak valid!");
                    System.out.println("=".repeat(50));
                    break;
            }
        }
    }

    static void cetakInfo() {
        Peternakan.cetakInfo();
    }

    static void cetakPemasukkan() {
        System.out.println("=".repeat(50));
        Peternakan.cetakPemasukkan();
        hitungPemasukkan();
        System.out.println("=".repeat(50));
    }

    static void cetakPPN() {
        System.out.println("=".repeat(50));
        Peternakan.cetakPPN(ppn);
        hitungPPN();
        System.out.println("=".repeat(50));

    }

    static void hitungPemasukkan() {
        double total = bebek.hitungPemasukkan() + unta.hitungPemasukkan() + domba.hitungPemasukkan();
        System.out.printf("Total Pemasukkan : %.0f\n", total);
    }

    static void hitungPPN() {
        double total = bebek.hitungPPN(ppn) + unta.hitungPPN(ppn) + domba.hitungPPN(ppn);
        System.out.printf("Total Pemasukkan : %.0f\n", total);
    }

}