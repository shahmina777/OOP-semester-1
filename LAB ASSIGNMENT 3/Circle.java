public class Circle extends Shape2D{
    private double radius;

    public Circle() {
    }

    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius() {
        return radius;
    }

    @Override
    public double area(){
        return Math.PI*radius*radius;
    }


    @Override
    public boolean isFilled() {
        return false;
    }
    public String toString(){
        return "CIRCLE METHODS: /n Area: "+ area();
    }

    @Override
    public void draw() {
        System.out.println("Draw method of circle");
    }
}
