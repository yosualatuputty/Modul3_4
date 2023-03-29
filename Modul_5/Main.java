import java.util.Scanner;

public class Main {
static Peternakan bebek = new Peternakan("Bebek","Telur Biasa", 15, "Telur", 2, 2000, "butir");
static Peternakan unta = new Peternakan("Unta", "Susu Putih",3, "Susu", 5, 60000, "liter");
static Peternakan domba = new Peternakan("Domba", "Bulu Hitam", 4, "Bulu", 4, 15000, "kg");
static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        boolean active = true;
        
        System.out.println("Menu:");
        System.out.println("1. Menampilkan Informasi Peternakan\n2. Menampilkan Total Pemasukan Harian\n3. Menampilkan Harga Setelah PPN\n4. Exit");
        System.out.print("Masukkan Menu Anda: ");
        int pilihan = sc.nextInt();

        while(active){
            switch (pilihan) {
                case 1:
                cetakInfo(); 
                case 2:

                case 3:
   
                case 4: 
                active = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }

    static void cetakInfo(){
        breakLine();
        System.out.println(bebek.cetakInfo());
        breakLine();
        System.out.println(unta.cetakInfo());
        breakLine();
        System.out.println(domba.cetakInfo());
        breakLine();
    }

    static void cetakPemasukkan(){
        breakLine();
        bebek.cetakPemasukkan();
        breakLine2();
        unta.cetakPemasukkan();
        breakLine2();
        domba.cetakPemasukkan();
        breakLine2();
        hitungPemasukkan();
        breakLine();

    }

    static void hitungPemasukkan(){
        double total = bebek.hitungPemasukkan() + unta.hitungPemasukkan() + domba.hitungPemasukkan();
        System.out.println("Total Pemasukkan: " + total);
    }
    static void breakLine(){
        System.out.println("=".repeat(50));
    }

    static void breakLine2(){
        System.out.println("-".repeat(50));
    }


}