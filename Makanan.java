public class Makanan {
    private String[] daftarMakanan;
    private double[] hargaMakanan;
    private int jumlahMakanan;

    public Makanan() {
        this.daftarMakanan = new String[]{"Nasi Goreng", "Mie Goreng", "Ayam Goreng", "Sate"};
        this.hargaMakanan = new double[]{25000, 20000, 30000, 35000};
        this.jumlahMakanan = 4;
    }

    public void tampilkanMakanan() {
        for (int i = 0; i < jumlahMakanan; i++) {
            System.out.println((i+1) + ". " + daftarMakanan[i] + " - Rp. " + hargaMakanan[i]);
        }
    }
}