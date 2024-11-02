public class Manager {
    private double totalPendapatan;
    private int jumlahPesanan;

    public Manager() {
        this.totalPendapatan = 0;
        this.jumlahPesanan = 0;
    }

    public void tampilkanLaporan() {
        System.out.println("=== Laporan Restaurant ===");
        System.out.println("Total Pendapatan: Rp. " + totalPendapatan);
        System.out.println("Jumlah Pesanan: " + jumlahPesanan);
    }

    public void updateLaporan(double pendapatan) {
        this.totalPendapatan += pendapatan;
        this.jumlahPesanan++;
    }
}