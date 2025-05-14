public abstract class Shape implements Drawable {
    private String name;
    Shape(String name){
        this.name=name;
    }

    public Shape() {
    }

    public abstract double area();
}
