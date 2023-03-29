public class Peternakan {
    final double ppn = 0.1;
    private String binatang = "Binatang";
    private String ras = "Ras";
    private double jml = 0;
    private double hasil = 0;
    private double harga = 0;
    private String namaHasil = "Nama Hasil";
    private String satuan = "Satuan";

    Peternakan(String binatang, String ras, double jml, String namaHasil, double hasil, double harga, String satuan){
        this.binatang = binatang;
        this.ras = ras;
        this.jml = jml;
        this.hasil = hasil;
        this.harga = harga;
        this.namaHasil = namaHasil;
        this.satuan = satuan;

    }

    public double hitungPemasukkan(){
        return hasil * harga * jml;
    }
    public String cetakPemasukkan(){
        return String.format("Jenis\t\t: %s | %s\nPemasukkan\t &d", binatang, ras, hitungPemasukkan());
    }
    public String cetakInfo(){
        return String.format("Jenis\t\t\t: %s\nRas\t\t\t: %s\nJumlah\t\t\t: %.0f ekor\n%s/Ekor\t\t: %.0f %s\nTotal %s/Hari\t: %.0f %s\nHarga %s/%s\t: %.0f", binatang, ras, jml, namaHasil, hasil, satuan, namaHasil, jml * hasil, satuan, namaHasil, satuan, harga);
    }
}
