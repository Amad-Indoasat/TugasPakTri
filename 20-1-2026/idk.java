import java.util.Scanner;

public class idk {
    public static void main(String[] args) {
    
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Inputkan Nama Anda : ");
        String nama = inputUser.nextLine();
        System.out.println("Nama Yang Anda Input : " + nama);
        
        System.out.print("Berapakah Nomor Absen Anda : ");
        int absen = inputUser.nextInt();
        System.out.println("Nomor Absen Anda : " + absen);

        System.out.print("Berapakah Uang Sakumu : ");
        double uang = inputUser .nextDouble();
        System.out.println("Uang Saku Anda Adalah : " + uang);
        
        Scanner masukkan = new Scanner(System.in);
        System.out.print("Character yang kamu suka : ");
        String simbol = masukkan.nextLine();
        System.out.println("Character yang kamu suka adalah : " + simbol);
        }
}
