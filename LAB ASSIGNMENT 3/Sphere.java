public class Sphere extends Shape3D{
    private double radius;


    public Sphere() {
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return 4*Math.PI*radius*radius;
    }

    @Override
    public double volume() {
        return Math.PI*radius*radius*radius*(4/3);
    }
    public String toString(){
        return "SPHERE METHODS: /n Area: "+ area() + "/n Volume: " +volume();
    }

    @Override
    public void draw() {
        System.out.println("Draw method of sphere");
    }
}
