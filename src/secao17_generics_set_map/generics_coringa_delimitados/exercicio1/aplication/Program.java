package secao17_generics_set_map.generics_coringa_delimitados.exercicio1.aplication;

import secao17_generics_set_map.generics_coringa_delimitados.exercicio1.entities.Circle;
import secao17_generics_set_map.generics_coringa_delimitados.exercicio1.entities.Rectangle;
import secao17_generics_set_map.generics_coringa_delimitados.exercicio1.interfaces.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
   public static void main(String[] args) {
       List<Shape> myShapes = new ArrayList<>();
       myShapes.add(new Rectangle(3.0,2.0));
       myShapes.add((new Circle(2.0)));

       List<Circle> myCircles = new ArrayList<>();
       myCircles.add(new Circle(2.0));
       myCircles.add(new Circle(3.0));

       System.out.println("Total area: " + totalArea(myCircles));
   }
   public static double totalArea(List<? extends Shape> list){ // Lista coringa de qualquer tipo/subtipo de Shape
       double sum = 0;
       for(Shape s:list){
           sum += s.area();
       }
       return sum;
   }
}
