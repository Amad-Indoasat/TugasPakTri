import java.util.Scanner;

public class zodiak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Sistem Zodiak Sederhana ===");
        System.out.print("Masukkan tanggal lahir (1-31): ");
        int tanggal = input.nextInt();
        
        System.out.print("Masukkan bulan lahir (1-12): ");
        int bulan = input.nextInt();
        
        String namaZodiak = "";
        String pesan = "";
        boolean isValid = true;

        if (bulan < 1 || bulan > 12) {
            System.out.println("Error: Bulan harus antara 1 sampai 12!");
            isValid = false;
        } else {
            int maxHari = 31;
            if (bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11) {
                maxHari = 30;
            } else if (bulan == 2) {
                maxHari = 29;
            }
            
            if (tanggal < 1 || tanggal > maxHari) {
                System.out.println("Error: Tanggal tidak valid untuk bulan ini (Maksimum " + maxHari + ")!");
                isValid = false;
            }
        }

        if (isValid) {
            if ((bulan == 3 && tanggal >= 21) || (bulan == 4 && tanggal <= 19)) {
                namaZodiak = "Aries";
                pesan = "Semangatmu berapi-api, teruslah memimpin jalan!";
            } else if ((bulan == 4 && tanggal >= 20) || (bulan == 5 && tanggal <= 20)) {
                namaZodiak = "Taurus";
                pesan = "Ketekunanmu adalah kunci kesuksesanmu.";
            } else if ((bulan == 5 && tanggal >= 21) || (bulan == 6 && tanggal <= 20)) {
                namaZodiak = "Gemini";
                pesan = "Kecerdasan dan adaptabilitasmu luar biasa.";
            } else if ((bulan == 6 && tanggal >= 21) || (bulan == 7 && tanggal <= 22)) {
                namaZodiak = "Cancer";
                pesan = "Hatimu lembut, kasih sayangmu tak terbatas.";
            } else if ((bulan == 7 && tanggal >= 23) || (bulan == 8 && tanggal <= 22)) {
                namaZodiak = "Leo";
                pesan = "Karisma dan percaya dirimu selalu bersinar.";
            } else if ((bulan == 8 && tanggal >= 23) || (bulan == 9 && tanggal <= 22)) {
                namaZodiak = "Virgo";
                pesan = "Detail kecil tidak pernah luput dari pandanganmu.";
            } else if ((bulan == 9 && tanggal >= 23) || (bulan == 10 && tanggal <= 22)) {
                namaZodiak = "Libra";
                pesan = "Keseimbangan dan keadilan adalah prinsipmu.";
            } else if ((bulan == 10 && tanggal >= 23) || (bulan == 11 && tanggal <= 21)) {
                namaZodiak = "Scorpio";
                pesan = "Intuisimu tajam, tekadmu tak tergoyahkan.";
            } else if ((bulan == 11 && tanggal >= 22) || (bulan == 12 && tanggal <= 21)) {
                namaZodiak = "Sagittarius";
                pesan = "Jiwa petualangmu membawa kebahagiaan.";
            } else if ((bulan == 12 && tanggal >= 22) || (bulan == 1 && tanggal <= 19)) {
                namaZodiak = "Capricorn";
                pesan = "Disiplin dan ambisimu akan membawamu ke puncak.";
            } else if ((bulan == 1 && tanggal >= 20) || (bulan == 2 && tanggal <= 18)) {
                namaZodiak = "Aquarius";
                pesan = "Ide-idemu unik dan selalu visioner.";
            } else if ((bulan == 2 && tanggal >= 19) || (bulan == 3 && tanggal <= 20)) {
                namaZodiak = "Pisces";
                pesan = "Imajinasimu indah dan penuh empati.";
            }
            
            System.out.println("------------------------------------------------");
            System.out.println("Zodiak Anda adalah: " + namaZodiak);
            System.out.println("Kata-kata hari ini: \"" + pesan + "\"");
            System.out.println("------------------------------------------------");
        }
        
        input.close();
    }
}
