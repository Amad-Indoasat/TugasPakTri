import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        int nilai;
        Scanner InputUser = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        nilai = InputUser.nextInt();
        System.out.println("Nilai Anda: " + nilai);

        if (nilai >= 90) {
            System.out.println("A");
        } else if (nilai >= 89 && nilai < 80) {
            System.out.println("B");
        } else if (nilai >= 79 && nilai < 60) {
            System.out.println("C");
        } else if (nilai >= 59 && nilai < 40) {
            System.out.println("D");
        } else if (nilai >= 39 && nilai < 20) {
            System.out.println("E");
        } else {
            System.out.println("Hukuman Mati");
        }
    }
}