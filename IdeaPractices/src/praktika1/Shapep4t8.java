package praktika1;

abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        this.color = "Без цвета";
        this.filled = false;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "цвет: " + color + (filled ? ", закрашенная" : ", не закрашенная");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle() {
        super();
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super();
        setRadius(radius);
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = 1.0;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Круг радиуса " + radius + ", " + super.toString() + ", площадь: " + String.format("%.2f", getArea()) + ", периметр: " + String.format("%.2f", getPerimeter());
    }
}

class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        super();
        setWidth(width);
        setLength(length);
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            this.width = 1.0;
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = 1.0;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Прямоугольник со сторонами " + width + " и " + length + ", " + super.toString() + ", площадь: " + String.format("%.2f", getArea()) + ", периметр: " + String.format("%.2f", getPerimeter());
    }
}

class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return width; // у квадрата width == length
    }

    public void setSide(double side) {
        this.width = 1.0;
        this.length = 1.0;
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "Квадрат со стороной " + getSide() + ", " + super.toString();
    }
}

public class Shapep4t8 {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0, "красный", true);
        shapes[1] = new Rectangle(4.0, 6.0, "синий", false);
        shapes[2] = new Square(3.0, "зелёный", true);

        System.out.println("=== Информация о фигурах ===");
        for (Shape s : shapes) {
            System.out.println(s);
        }
    }
}