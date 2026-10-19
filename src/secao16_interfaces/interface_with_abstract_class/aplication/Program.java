package secao16_interfaces.interface_with_abstract_class.aplication;

import secao16_interfaces.interface_with_abstract_class.model.entities.AbstractShape;
import secao16_interfaces.interface_with_abstract_class.model.entities.Circle;
import secao16_interfaces.interface_with_abstract_class.model.entities.Rectangle;
import secao16_interfaces.interface_with_abstract_class.model.enums.Color;

public class Program {

    public static void main(String[] args) {

        AbstractShape s1 = new Circle(Color.BLACK, 2.0);
        AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle color: " + s1.getColor());
        System.out.println("Circle area: " + String.format("%.3f", s1.area()));
        System.out.println("Rectangle color: " + s2.getColor());
        System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
    }
}
