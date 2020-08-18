package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(int length, int width){
        super(length, width);
    }

    @Override
    public void setLength(int length){
        this.length = length;
    }

    @Override
    public void setWidth(int width){
        this.width = width;
    }


    @Override
    public int getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public int getArea() {
        return length * width;
    }


//    protected int length;
//    protected int width;
//
//    public Rectangle(int length, int width){
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public int getArea() {
//        return length * width;
//    }
//
//    public int getPerimeter(){
//        return (2 * length) + (2 * width);
//    }

}
