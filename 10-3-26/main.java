public class main {

    static void sapa(String nama, int umur, String hobi) { // "nama" adalah parameter
        System.out.println("Halo " + nama + ", Umurmu " + umur + ", Hobi mu " + hobi);
    }

    // static void umur(int umur) {
    // System.out.println("Umurmu adalah " + umur);
    // }

    // static void hobi(String hobi) {
    // System.out.println("Hobi mu adalah " + hobi);
    // }

    public static void main(String[] args) {
        sapa("Dayy", 16, "Main Game");
        sapa("Tarzz", 16, "Ngoding");
        // umur(16);
        // hobi("Main Game");
    }
}
