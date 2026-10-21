package secao18_programacao_funcional_lambda.interfaces_funcionais.comparator.aplication;

import secao18_programacao_funcional_lambda.interfaces_funcionais.comparator.entities.Product;

import java.util.Comparator;

public class MyComparator implements Comparator<Product> {


    @Override
    public int compare(Product p1, Product p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
