public class Pelanggan {
    private String Nama;
    private String Nomormeja;
    private Pesanan pesanan;

    public Pelanggan() {
        this.pesanan = new Pesanan();
    }

    public void buatPesanan() {
        System.out.println("Pelanggan membuat pesanan baru");
        pesanan.tambahPesanan();
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public void setNomorMeja(String nomorMeja) {
        this.Nomormeja = nomorMeja;
    }
}
