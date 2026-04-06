public class Main {

    // Method 1: 2 parameter int
    static int perkalian(int a, int b) {
        return a * b;
    }

    // Method 2: 3 parameter int
    static int perkalian(int a, int b, int c) {
        return a * b * c;
    }

    // Method 3: parameter double
    static double perkalian(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println(perkalian(2, 3)); // 6
        System.out.println(perkalian(2, 3, 4)); // 24
        System.out.println(perkalian(2.5, 4.0)); // 10.0
    }
}