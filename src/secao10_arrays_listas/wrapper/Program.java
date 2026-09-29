package secao10_arrays_listas.wrapper;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        // TIPOS PRIMITIVOS

        int x = 10;
        double price = 99.90;
        boolean active = true;

        // WRAPPERS

        // Integer é o Wrapper do int
        Integer y = 10;

        // Double é o Wrapper do double
        Double value = 99.90;

        // Boolean é o Wrapper do boolean
        Boolean status = true;


        // =========================
        // BOXING
        // =========================

        /*
         * Boxing:
         *
         * Tipo primitivo → Wrapper
         *
         * int → Integer
         */

        int number = 10;

        Integer numberWrapper = number;

        System.out.println("Boxing:");
        System.out.println("Primitivo: " + number);
        System.out.println("Wrapper: " + numberWrapper);


        // =========================
        // UNBOXING
        // =========================

        /*
         * Unboxing:
         *
         * Wrapper → Tipo primitivo
         *
         * Integer → int
         */

        Integer wrapper = 20;

        int numberPrimitive = wrapper;

        System.out.println("\nUnboxing:");
        System.out.println("Wrapper: " + wrapper);
        System.out.println("Primitivo: " + numberPrimitive);


        // =========================
        // WRAPPERS E ARRAYLIST
        // =========================

        /*
         * ArrayList trabalha com objetos.
         *
         * Por isso usamos Integer em vez de int.
         */

        ArrayList<Integer> numbers = new ArrayList<>();

        // Autoboxing:
        // int → Integer
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("\nArrayList:");
        System.out.println(numbers);


        // =========================
        // AUTO-UNBOXING
        // =========================

        Integer firstNumber = numbers.get(0);

        // Integer → int
        int firstNumberPrimitive = firstNumber;

        System.out.println("\nAuto-unboxing:");
        System.out.println(firstNumberPrimitive);
    }
}
