import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        
        Scanner InputUser = new Scanner(System.in);

        String Nama = InputUser.nextLine();
        int Umur = InputUser.nextInt();
        InputUser.nextLine();
        String Jurusan = InputUser.nextLine();
        String Status = InputUser.nextLine();

        System.out.println("Nama: " + Nama);
        System.out.println("Umur: " + Umur);
        System.out.println("Jurusan: " + Jurusan);
        System.out.println("Status: " + Status);

        InputUser.close();

    }   
}  