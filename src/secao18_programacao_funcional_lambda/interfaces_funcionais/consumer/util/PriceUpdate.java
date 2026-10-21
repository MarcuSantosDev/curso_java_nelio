package secao18_programacao_funcional_lambda.interfaces_funcionais.consumer.util;

import java.util.function.Consumer;

import secao18_programacao_funcional_lambda.interfaces_funcionais.consumer.entities.Product;

public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
