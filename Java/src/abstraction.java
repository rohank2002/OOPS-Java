abstract class shape {
    String color;

    abstract double area();

    public abstract String toString();

    public  shape(String color) {
        System.out.println("Shape constructor called");
        this.color = color;

    }

    public String getColor() {
        return color;
    }
}
    class Circle extends shape{
        double radius;
        public Circle(String color, double radius){
            super(color);
            System.out.println("Circle constructed called");
            this.radius=radius;

        }
        @Override
        double area(){
            return Math.PI * Math.pow(radius,2);

        }
        @Override
        public String toString(){
            return "circle color is : "+super.color +" and area is : "+area();
        }

    }
    class Rectangle extends shape{
    double width;
    double length;
    public Rectangle(String color,double width, double length){
        super(color);
        System.out.println("Rectangle constructor called");
        this.width = width;
        this.length = length;

    }
    @Override
    double area(){
        return width*length;
    }
    @Override
    public String toString(){
        return "Rectangle color is :" +super.color+ " and area is : "+area();
    }
    }

public class abstraction {
    public static void main(String[] args) {
    shape S1= new Circle("Red",2.2);
    shape S2= new Rectangle("Yellow",5,3);
    System.out.println(S1.toString());
    System.out.println(S2.toString());
    }
}
