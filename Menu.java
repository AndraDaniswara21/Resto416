public class Menu {
    private Makanan makanan;
    private Minuman minuman;

    public Menu() {
        this.makanan = new Makanan();
        this.minuman = new Minuman();
    }

    public void tampilkanMenu() {
        System.out.println("\n=== MENU RESTAURANT ===");
        System.out.println("=== MAKANAN ===");
        makanan.tampilkanMakanan();
        System.out.println("\n=== MINUMAN ===");
        minuman.tampilkanMinuman();
    }
}