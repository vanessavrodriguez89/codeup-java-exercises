package shapes;

public class Square extends Rectangle{
    protected double side;
    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    //override Square class
    public double getArea(){
        return 4 * side;
    }

    public double getPerimeter(){
        return Math.pow(side, 2);
    }
}
