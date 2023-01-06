package day35_OOP_Encapsulation.squareTask;

public class TestSquare {

    public static void main(String[] args) {

        Square square =new Square(7.5);
        System.out.println(square);

        square.setSide(10.5);
        System.out.println(square.getSide());

        System.out.println(square);

    }
}
