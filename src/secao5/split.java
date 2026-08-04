package secao5;

import java.util.Scanner;

public class split {
    public static void main(String[] args){
        String s = "potato apple lemon orange";

        String[] vect = s.split(" "); // pega uma única String e a transforma em um vetor (String[]), separando-a conforme o delimitador informado

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);
    }
}
