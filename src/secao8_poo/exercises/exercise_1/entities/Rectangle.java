package secao8_poo.exercises.exercise_1.entities;

public class Rectangle {
    public double width;
    public double height;
    public double area;
    public double perimeter;
    public double diagonal;

    public double calculate_Area() {
        area = width * height;
        return area;
    }

    public double calculate_Perimeter() {
        perimeter = 2*(width+height);
        return perimeter;
        }

    public double calculate_Diagonal() {
        return Math.sqrt(width * width + height * height);
    }

}
