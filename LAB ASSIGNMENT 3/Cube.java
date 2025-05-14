public class Cube extends Shape3D{
    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public Cube() {
    }

    @Override
    public double volume() {
        return side*side*side;
    }

    @Override
    public double area() {
        return 6*side*side*side*side*side*side;
    }
    public String toString(){
        return "CUBE METHODS: /n Area: "+ area() + "/n Volume: " +volume();
    }

    @Override
    public void draw() {
        System.out.println("Draw method of cube");
    }
}
