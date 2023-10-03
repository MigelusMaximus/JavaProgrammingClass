// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        KomplexniCislo a = new KomplexniCislo(1.0, 2.0);
        KomplexniCislo b = new KomplexniCislo(2.0, 3.0);
        KomplexniCislo sum = a.add(b);
        KomplexniCislo difference = a.subtract(b);
        KomplexniCislo product = a.multiply(b);
        System.out.println("a: " + String.valueOf(a));
        System.out.println("b: " + String.valueOf(b));
        System.out.println("a + b: " + String.valueOf(sum));
        System.out.println("a - b: " + String.valueOf(difference));
        System.out.println("a * b: " + String.valueOf(product));
    }
}