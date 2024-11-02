public class Minuman {
    private String[] daftarMinuman;
    private double[] hargaMinuman;
    private int jumlahMinuman;

    public Minuman() {
        this.daftarMinuman = new String[]{"Es Teh", "Es Jeruk", "Es Kopi", "Air Mineral"};
        this.hargaMinuman = new double[]{5000, 7000, 10000, 3000};
        this.jumlahMinuman = 4;
    }

    public void tampilkanMinuman() {
        for (int i = 0; i < jumlahMinuman; i++) {
            System.out.println((i+1) + ". " + daftarMinuman[i] + " - Rp. " + hargaMinuman[i]);
        }
    }
}