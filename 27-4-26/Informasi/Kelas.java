package Informasi;

import java.util.Scanner;

public class Kelas {

        public String nama = "Ahmad";
        public int nilai;

        public void input() {
                Scanner s = new Scanner(System.in);
                System.out.print("Masukkan Nama : ");
                nama = s.nextLine();
                System.out.print("Masukkan Nilai : ");
                nilai = s.nextInt();
        }

        public void tampilkan() {
                System.out.println("Nama : " + nama);
                System.out.println("Nilai : " + nilai);
        }

        public void sapa() {
                System.out.println("Halo, nama saya " + nama
                                + ". Method ini dipanggil dari Kelas.java dgn package Informasi");
        }

}
