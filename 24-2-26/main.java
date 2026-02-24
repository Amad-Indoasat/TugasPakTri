public class main {
    public static void main(String[] args) {

        notmain nm = new notmain();
        notnotmain nnm = new notnotmain();

        System.out.println("===========NOTMAIN===========");

        System.out.println("Nama : " + nm.nama);
        System.out.println("Umur : " + nm.umur);
        System.out.println("Tinggi : " + nm.tinggi);

        System.out.println("===========LUAS NOTMAIN============");
        nm.data();

        System.out.println("======================================");

        double Tampil = nm.hitungPersegi();
        System.out.println("Luas : " + Tampil);

        System.out.println("===========NOTNOTMAIN============");
        nnm.data();

        System.out.println("===========LUAS NOTNOTMAIN============");

        int Tampil2 = nnm.hitungPersegi();
        System.out.println("Luas : " + Tampil2);

    }

}