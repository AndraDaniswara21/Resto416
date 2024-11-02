public class main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Pelanggan pelanggan = new Pelanggan();
        Menu menu = new Menu();
        Pesanan pesanan = new Pesanan();

        manager.tampilkanLaporan();
        pelanggan.buatPesanan();
        menu.tampilkanMenu();
        pesanan.tambahPesanan();
    }
}