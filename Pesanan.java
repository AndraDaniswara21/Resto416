public class Pesanan {
    private String[] daftarPesanan;
    private double totalHarga;
    private int jumlahPesanan;

    public Pesanan() {
        this.daftarPesanan = new String[10];
        this.totalHarga = 0;
        this.jumlahPesanan = 0;
    }

    public void tambahPesanan() {
        System.out.println("Menambahkan pesanan baru ke daftar pesanan");
    }

    public void hitungTotal() {
        System.out.println("Total pesanan: Rp. " + totalHarga);
    }

    public void tampilkanPesanan() {
        System.out.println("=== Daftar Pesanan ===");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println(daftarPesanan[i]);
        }
    }
}
