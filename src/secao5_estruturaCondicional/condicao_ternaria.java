package secao5_estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class condicao_ternaria {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        double preco;
        double desconto;
        double precoFinal;

        System.out.print("Digite o preço do produto: ");
        preco = scanner.nextDouble();

        System.out.print("Digite o percentual de desconto: ");
        desconto = scanner.nextDouble();

        // Condição Ternária
        precoFinal = desconto > 0
                ? preco - (preco * desconto / 100)
                : preco;

        System.out.printf("Preço final: R$ %.2f%n", precoFinal);

        scanner.close();
    }
}
