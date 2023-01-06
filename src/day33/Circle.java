package day33;

public class Circle {
    public double radius,diameter;
    public static double pi=3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calcArea(){
        return radius*radius*pi;
    }

    public double calcPerimeter(){
     return 2*pi*radius;
    }

    public  double diameter(){
        return 2*radius;
    }

    public static void printPi(){
        System.out.println("PI value is ="+ pi);
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter() +
                ", area= " + calcArea() +
                ", perimeter= " + calcPerimeter() +
                ", pi value= " + pi+
                '}';
    }
}
/*
1. Create a class named Circle:

				Attributes:
					instance: radius, diameter
					static: pi

				Add a constructor that can set All the fields (instances)
					HINT: we only need to know the radius to set the radius & diameter

				Actions:
					calcArea(): returns the area of Circle
					calcPerimeter(): returns the perimeter of Circle
					printPi(): displays PI value
					toString(): displays the radius, diameter, pi, area and perimeter of the circle when the object of circle is passed in the print statement
 */