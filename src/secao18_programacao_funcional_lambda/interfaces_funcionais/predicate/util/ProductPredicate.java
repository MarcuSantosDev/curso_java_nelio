package secao18_programacao_funcional_lambda.interfaces_funcionais.predicate.util;

import secao18_programacao_funcional_lambda.interfaces_funcionais.predicate.entities.Product;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100.0;
    }
}
