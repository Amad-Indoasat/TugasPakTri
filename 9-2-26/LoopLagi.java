import java.util.Scanner;

public class LoopLagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input tinggi untuk pola
        System.out.print("Masukkan tinggi pola: ");
        int tinggi = input.nextInt();

        // 1. SEGITIGA SAMA KAKI
        System.out.println("\n=== SEGITIGA SAMA KAKI ===");
        for (int i = 1; i <= tinggi; i++) {
            // Cetak spasi
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }
            // Cetak bintang
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2. JAJAR GENJANG
        System.out.println("\n=== JAJAR GENJANG ===");
        for (int i = 1; i <= tinggi; i++) {
            // Cetak spasi (menurun)
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }
            // Cetak bintang
            for (int k = 1; k <= tinggi; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 3. BELAH KETUPAT
        System.out.println("\n=== BELAH KETUPAT ===");
        // Bagian atas (termasuk tengah)
        for (int i = 1; i <= tinggi; i++) {
            // Cetak spasi
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }
            // Cetak bintang
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Bagian bawah
        for (int i = tinggi - 1; i >= 1; i--) {
            // Cetak spasi
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }
            // Cetak bintang
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}
