public class Main {
    public static void main(String args[]) {

        Shape shape;
        Shape2D shape2D;
        Shape3D shape3D;
        Circle c1 = new Circle();
        Rectangle r1 = new Rectangle();
        Sphere s1 = new Sphere();
        Cube cube1 = new Cube();

        c1.setRadius(2);
        r1.setLength(3);
        r1.setWidth(4);
        s1.setRadius(4);
        cube1.setSide(2);

        System.out.println("Single shape details:");
        System.out.println("Circle Area: " + c1.area());
        System.out.println("Rectangle Area: " + r1.area());
        System.out.println("Rectangle Perimeter: " + r1.perimeter());
        System.out.println("Sphere Area: " + s1.area());
        System.out.println("Sphere Volume: " + s1.volume());
        System.out.println("Cube Area: " + cube1.area());
        System.out.println("Cube Volume: " + cube1.volume());

        Shape[] arr = new Shape[20];
        arr[0] = new Circle();
        ((Circle) arr[0]).setRadius(2);
        arr[1] = new Rectangle();
        ((Rectangle) arr[1]).setLength(2);
        ((Rectangle) arr[1]).setWidth(2);
        arr[3] = new Sphere();
        ((Sphere) arr[3]).setRadius(2);
        arr[4] = new Cube();
        ((Cube) arr[4]).setSide(2);
        arr[5] = new Circle();
        ((Circle) arr[5]).setRadius(2);
        arr[6] = new Rectangle();
        ((Rectangle) arr[6]).setLength(2);
        ((Rectangle) arr[6]).setWidth(2);
        arr[7] = new Sphere();
        ((Sphere) arr[7]).setRadius(2);
        arr[8] = new Cube();
        ((Cube) arr[8]).setSide(2);
        arr[9] = new Circle();
        ((Circle) arr[9]).setRadius(2);
        arr[10] = new Rectangle();
        ((Rectangle) arr[10]).setLength(2);
        ((Rectangle) arr[10]).setWidth(2);
        arr[11] = new Sphere();
        ((Sphere) arr[11]).setRadius(2);
        arr[12] = new Cube();
        ((Cube) arr[12]).setSide(2);
        arr[13] = new Circle();
        ((Circle) arr[13]).setRadius(2);
        arr[14] = new Rectangle();
        ((Rectangle) arr[14]).setLength(2);
        ((Rectangle) arr[14]).setWidth(2);
        arr[15] = new Sphere();
        ((Sphere) arr[15]).setRadius(2);
        arr[16] = new Cube();
        ((Cube) arr[16]).setSide(2);
        arr[17] = new Circle();
        ((Circle) arr[17]).setRadius(2);
        arr[18] = new Rectangle();
        ((Rectangle) arr[18]).setLength(2);
        ((Rectangle) arr[18]).setWidth(2);
        arr[19] = new Sphere();
        ((Sphere) arr[19]).setRadius(2);

        System.out.println("\nAll shapes in array:");
        ShapeUtils.displayShapes(arr);

        Drawable[] drawables = new Drawable[] { c1, r1, s1, cube1 };
        System.out.println("\nDrawing all drawables:");
        ShapeUtils.drawable(drawables);

        Rectangle testRect = new Rectangle(); // define testRect
        testRect.setLength(2);
        testRect.setWidth(2);

        ShapeUtils utils = new ShapeUtils();
        boolean doesIntersect = utils.isIntersect(arr, testRect);
        System.out.println("\nAny intersection with test rectangle? " + doesIntersect);
    }
}
