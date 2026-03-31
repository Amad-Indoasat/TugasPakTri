public class AplOverload {
    public static void main(String[] args) {
        Overloading object = new Overloading();
        FOverloading obj = new FOverloading();

        object.DataKelas("10 RPL ");
        object.DataKelas("10 RPL ", "36");
        System.out.println("==================================================");
        object.NamaKeren("Dayy");
        object.NamaKeren("Dayy", 16);
        System.out.println("==================================================");
        obj.namaKeren("Dayy");
        obj.namaKeren("Hollow Knight", "Mudah");
    }
}