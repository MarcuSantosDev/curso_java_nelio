package secao10_arrays_listas.boxing;

public class Program {
    public static void main(String[] args) {
        int x = 10;

        Integer y = x; // Boxing
        int z = y;     // Unboxing

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
