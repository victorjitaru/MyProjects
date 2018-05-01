public class Square extends Rectangle {

    public Square(Double side){
        super(side, side);
    }

    @Override
    public Double calculateArea() {
        return getWidth() * getWidth();
    }

    @Override
    public Double calculatePerimeter() {
        return getWidth() * 4;
    }

    @Override
    public String toString() {
        return "Square { side: " + getWidth() + "}";
    }
}