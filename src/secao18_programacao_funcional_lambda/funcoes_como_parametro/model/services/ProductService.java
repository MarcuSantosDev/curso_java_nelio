package secao18_programacao_funcional_lambda.funcoes_como_parametro.model.services;

import java.util.List;
import java.util.function.Predicate;

import secao18_programacao_funcional_lambda.funcoes_como_parametro.model.entities.Product;

public class ProductService {

    public double filteredSum(List<Product> list, Predicate<Product> criteria) {
        double sum = 0.0;
        for (Product p : list) {
            if (criteria.test(p)) {
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
