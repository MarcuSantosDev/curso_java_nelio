package secao4_estruturaSequencial;

import java.util.Scanner;

public class exercicio_telefonia_condicionais {
    public static void main (String[] args){
    int minutos_de_uso;
    int minutos_extras;
    int custo_fixo = 50;
    int custo_adicional;
    int custo_total;
    Scanner scanner = new Scanner((System.in));

    System.out.println("Quantas minutos de uso ?");
    minutos_de_uso = scanner.nextInt();
    minutos_extras = minutos_de_uso - 100;

    if (minutos_extras >0){
        custo_adicional = minutos_extras*2;
        custo_total = custo_fixo + custo_adicional;
        System.out.printf("O custo total foi de %d$ para %d minutos utilizadas",custo_total,minutos_de_uso);
    }
    else {
        custo_total = custo_fixo;
        System.out.printf("O custo total foi de %d$ para %d minutos utilizadas",custo_total,minutos_de_uso);
    }

    scanner.close();
    }
}
