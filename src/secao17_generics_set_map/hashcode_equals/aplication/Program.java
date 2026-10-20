package secao17_generics_set_map.hashcode_equals.aplication;

import secao17_generics_set_map.hashcode_equals.entities.Client;

public class Program {
    public static void main(String[] args) {

        // Equals :
        // Verifica se dois objetos são iguais pelo seu conteúdo e retorna Boolean.
        // + Lento + Preciso

        String a = "Maria";
        String b = "Alex";
        System.out.println(a.equals(b));

        // Hashcode :
        // retorna um número inteiro usado por estruturas como HashSet e HashMap para organizar e localizar objetos
        // + Rápido - Preciso ( Pode haver colisão ).

        String c = "Maria";
        String d = "Alex";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());

        Client c1 = new Client("Marcus","marcus.xtreme03@gmail.com");
        Client c2 = new Client("Marcus","eduarda@gmail.com");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1==c2);

    }
}
