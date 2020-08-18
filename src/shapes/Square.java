package shapes;

public class Square extends Quadrilateral{
//    protected int side;
//
//    public Square(int side) {
//        super(side, side);
//        this.side = side;
//    }
//    //override Square class
//    public int getPerimeter(){
//        return 4 * this.side;
//    }
//
//    public int getArea(){
//        return (int)Math.pow(this.side, 2);
//    }

    public Square(int length, int width) {
        super(length, width);
    }

    @Override
    public void setLength() {

    }

    @Override
    public void setWidth() {

    }

    @Override
    public int getPerimeter() {
        return 4 * length;
    }

    @Override
    public int getArea() {
        return (int)Math.pow(length, 2);
    }
}
