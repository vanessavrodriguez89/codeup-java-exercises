package shapes;

public class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape = new Rectangle(5,4);
        System.out.println("The perimeter of the rectangle is: " + myShape.getArea());
        System.out.println("The area of the rectangle is: " + myShape.getPerimeter());

        Measurable myShape2 = new Square(5,5);
        System.out.println("The perimeter of the square is: " + myShape2.getArea());
        System.out.println("The area of the square is: " + myShape2.getPerimeter());

//        Rectangle box1 = new Rectangle(5,4);
//        System.out.println("The perimeter of the rectangle is: " + box1.getPerimeter()); //18
//        System.out.println("The area of the rectangle is: " + box1.getArea() + "\n\n"); //20
//
//        Rectangle box2 = new Square(5);
//        System.out.println("The perimeter of the square is: " + box2.getPerimeter()); //25
//        System.out.println("The area of the square is: " + box2.getArea()); //20

    }
    }