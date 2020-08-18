package shapes;

public class Square extends Quadrilateral{

    public Square(int side) {
        this.length = side;
        this.width = side;
    }

//    specific instance of a square
    public void setSide(int side){
        this.length = side;
        this.width = side;
    }
    @Override
    public void setLength(int length) {
        this.setSide(length);
    }

    @Override
    public void setWidth(int width) {
        this.setSide(length);
    }

    @Override
    public int getPerimeter() {
        return 4 * length;
    }

    @Override
    public int getArea() {
        return (int)Math.pow(length, 2);
    }
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
}
