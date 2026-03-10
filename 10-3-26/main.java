public class main {

    static String sapa(String nama, int umur, String hobi) {
        return "Halo " + nama + ", Umurmu " + umur + ", Hobi mu " + hobi;
    }

    // static void umur(int umur) {
    // System.out.println("Umurmu adalah " + umur);
    // }

    // static void hobi(String hobi) {
    // System.out.println("Hobi mu adalah " + hobi);
    // }

    public static void main(String[] args) {
        String hasil = sapa("Dayy", 16, "Main Game");
        System.out.println(hasil);
    }
}
