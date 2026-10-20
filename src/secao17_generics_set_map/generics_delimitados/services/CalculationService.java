package secao17_generics_set_map.generics_delimitados.services;

import java.util.List;

public class CalculationService {
    public static <T extends Comparable<T>> T max(List<T> list){ // Só aceita tipos T que implementem Comparable<T>
        if(list.isEmpty()){
            throw new IllegalStateException("A lista está vazia!");
        }
        T max = list.get(0);
        for(T item: list){
            if(item.compareTo(max) > 0){
                max = item;
            }
        }
        return max;
    }
}
