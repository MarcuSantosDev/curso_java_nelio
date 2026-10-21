package secao18_programacao_funcional_lambda.interfaces_funcionais.function.util;

import secao18_programacao_funcional_lambda.interfaces_funcionais.function.entities.Product;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {

    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
