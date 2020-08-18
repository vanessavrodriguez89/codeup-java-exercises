package shapes;

public class Square extends Rectangle{
    protected int side;
    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    //override Square class
    public int getPerimeter(){
        return 4 * this.side;
    }

    public int getArea(){
        return (int)Math.pow(this.side, 2);
    }
}
