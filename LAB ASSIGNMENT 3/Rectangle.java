public class Rectangle extends Shape2D{
    private double length;
    private double width;
    private double leftTopCorner;
    private double RightTopCorner;
    private double leftBottomCorner;
    private double rightBottomCorner;

    public Rectangle() {
    }

    @Override
    public boolean isFilled() {
        return false;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getLength() {
        return length;
    }



    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getLeftBottomCorner() {
        return leftBottomCorner;
    }

    public double getRightTopCorner() {
        return RightTopCorner;
    }

    public double getLeftTopCorner() {
        return leftTopCorner;
    }

    public void setLeftBottomCorner(double leftBottomCorner) {
        this.leftBottomCorner = leftBottomCorner;
    }

    public void setRightTopCorner(double rightTopCorner) {
        RightTopCorner = rightTopCorner;
    }

    public void setLeftTopCorner(double leftTopCorner) {
        this.leftTopCorner = leftTopCorner;
    }

    public double getRightBottomCorner() {
        return rightBottomCorner;
    }

    public void setRightBottomCorner(double rightBottomCorner) {
        this.rightBottomCorner = rightBottomCorner;
    }

    @Override
    public double area() {
        return length*width;
    }
    public double perimeter(){
        return 2*length*width;
    }
    public String toString(){
        return "RECTANGLE METHODS: /n Area: "+ area() + "/n Perimeter: " +perimeter();
    }


    @Override
    public void draw() {
        System.out.println("Draw method of rectangle");
    }
public boolean intersects(Rectangle other) {
    
    return this.length == other.length && this.width == other.width;
}
}
