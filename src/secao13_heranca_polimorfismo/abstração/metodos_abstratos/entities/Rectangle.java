package secao13_heranca_polimorfismo.abstração.metodos_abstratos.entities;

import secao13_heranca_polimorfismo.abstração.metodos_abstratos.enums.Color;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(){

    }

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double area(){
        return width*height;
    }
}
