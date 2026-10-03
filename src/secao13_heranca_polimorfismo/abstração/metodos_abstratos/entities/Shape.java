package secao13_heranca_polimorfismo.abstração.metodos_abstratos.entities;

import secao13_heranca_polimorfismo.abstração.metodos_abstratos.enums.Color;

public abstract class Shape {
    private Color color;

    public Shape(){

    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    // Para usar um método abstract a classe tb deve ser abstract
    // O método abstract serve para obrigar as classes filhas a implementarem determinado comportamento.
    public abstract double area();
}
