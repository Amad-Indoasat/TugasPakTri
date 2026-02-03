public class BelajarLoop {
    public static void main(String[] args) {

        System.out.println("---------Loop Nama----------");

        for (int h = 1; h <= 5; h++) {
            System.out.println(h + ". Hidayat");
        }

        System.out.println("---------Kiri Bawah----------");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---------Kiri Atas----------");

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---------Kanan Atas----------");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("---------Kanan Bawah----------");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
