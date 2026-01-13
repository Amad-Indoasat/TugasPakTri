public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------");
        System.out.println("Aritmatika");
        //Artimatika
        int a = 10;
        int b = 4;
        
        int penjumlahan = a + b;
        System.out.println("Hasil dari a+b adalah:" + penjumlahan);
        int pengurangan = a - b;
        System.out.println("Hasil dari a-b adalah:" + pengurangan);
        int perkalian = a * b;
        System.out.println("Hasil dari a*b adalah:" + perkalian);
        int pembagian = a / b;
        System.out.println("Hasil dari a/b adalah:" + pembagian);
        int modulo = a % b;
        System.out.println("Hasil dari a%b adalah:" + modulo);
        System.out.println("--------------------");

        //Penugasan
        System.out.println("Penugasan");
        int c = 10;
        c += 5;
        System.out.println(c);
        c -= 5;
        System.out.println(c);
        c *= 5;
        System.out.println(c);
        c /= 5;
        System.out.println(c);
        c %= 5;
        System.out.println(c);
        System.out.println("--------------------");

        //Pembandingan
        System.out.println("Pembandingan");
        int d = 10;
        int e = 4;
        System.out.println(d == e);
        System.out.println(d != e);
        System.out.println(d > e);
        System.out.println(d < e);
        System.out.println(d >= e);
        System.out.println(d <= e);
        System.out.println("--------------------");

        //Logika
        System.out.println("Logika");
        boolean f = true;
        boolean g = false;
        System.out.println(f && g);
        System.out.println(f || g);
        System.out.println(!f);
        System.out.println("--------------------");
    }
}