package secao4;

import java.util.Scanner;
import java.util.Locale;

public class aula_scanner {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char x;
        x = sc.next().charAt(0);
        sc.close();
        System.out.println(x);
    }
}
