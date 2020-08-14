package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        do {
            System.out.print("Please enter the radius of your circle: ");
            double entry = input.getDouble();

            Circle newCircle = new Circle(entry);

            System.out.println(newCircle.getArea());
            System.out.println(newCircle.getCircumference());
        } while( input.yesNo() );

    }
}

