public class Overloading {
    
    void DataKelas(String nmKelas) {
        System.out.println("Kelas Kita Adalah : " + nmKelas);
    }

    void DataKelas(String nmKelas, String jmlSiswa) {
        System.out.println("Kelas Kita Adalah : " + nmKelas);
        System.out.println("Jumlah Siswa : " + jmlSiswa);
    }

    void NamaKeren (String nmOrang) {
        System.out.println("Nama Orang : " + nmOrang);
    }

    void NamaKeren (String nmOrang, int umur) {
        System.out.println("Nama Orang : " + nmOrang);
        System.out.println("Umur : " + umur);
    }

}

class FOverloading {

    void namaKeren(String nmOrang) {
        System.out.println("Nama Orang : " + nmOrang);
    }

    void namaKeren(String nmGame, String Difficult) {
        System.out.println("Nama Game : " + nmGame);
        System.out.println("Tingkat Kesulitan : " + Difficult);
    }
}