public class obj {
    String nama;
    int umur;

    obj() {
        System.out.println("Objek dibuat");
    }

    obj(String nama) {
        System.out.println("Halo " + nama);
    }

    obj(String nama, int umur) {
        System.out.println("Halo " + nama + " Umurmu " + umur);
    }
}
