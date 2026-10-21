package secao18_programacao_funcional_lambda.stream;

/*
    STREAMS
    • É uma sequência de elementos proveniente de uma fonte de dados que oferece suporte a operações de processamento.
    • Fontes de dados: coleções, arrays, funções de iteração e recursos de E/S.

    OPERAÇÕES INTERMEDIÁRIAS
    • filter: filtra elementos que atendem a uma condição.
    • map: aplica uma função a cada elemento da stream.
    • flatMap: transforma elementos em Streams e os combina em um único Stream.
    • peek: observa elementos durante o processamento, geralmente para depuração.
    • distinct: remove elementos duplicados.
    • sorted: ordena os elementos.
    • skip: pula os primeiros N elementos.
    • limit (*): limita a quantidade de elementos processados/retornados.

    OPERAÇÕES TERMINAIS
    • forEach: executa uma ação para cada elemento.
    • forEachOrdered: executa uma ação respeitando a ordem de encontro.
    • toArray: converte os elementos em um array.
    • reduce: combina elementos para produzir um único resultado.
    • collect: reúne elementos em uma coleção ou outro resultado.
    • min: encontra o menor elemento.
    • max: encontra o maior elemento.
    • count: conta os elementos.
    • anyMatch (*): retorna true se pelo menos um elemento atender à condição.
    • allMatch (*): retorna true se todos os elementos atenderem à condição.
    • noneMatch (*): retorna true se nenhum elemento atender à condição.
    • findFirst (*): retorna o primeiro elemento, se existir.
    • findAny (*): retorna algum elemento, se existir.

    (*) SHORT-CIRCUIT
    • Permite encerrar o processamento antecipadamente quando o resultado já pode ser determinado ou quando
      a quantidade desejada é atingida.



    OBSERVAÇÕES
    • Operações intermediárias são lazy: só são executadas quando uma operação terminal inicia o processamento.
    • Após uma operação terminal, o Stream não pode ser reutilizado.

    Referência:
    https://www.oracle.com/br/technical-resources/articles/java-stream-api.html
*/


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Resumo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
        Stream<Integer> st1 = list.stream();
        System.out.println(Arrays.toString(st1.toArray()));
        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob"); // Cria stream com esses elementos
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2); // itera +2 infinitamente
        System.out.println(Arrays.toString(st3.limit(10).toArray())); // Limita até 10 elemntos iterados

        // Sequência de Fibonacc
        Stream<Long> st4 = Stream.iterate(new long[]{ 0L, 1L }, p->new long[]{ p[1], p[0]+p[1] }).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(10).toArray()));
    }

}
