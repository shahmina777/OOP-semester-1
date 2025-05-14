public class ShapeUtils {

    public static void displayShapes(Shape[] shape){
        for(Shape s: shape)
            System.out.println(s);
    }
   public void increaseRectangle(Shape[] shapes){
	
    }

    public static void drawable(Drawable[] drawables) {
        for (Drawable d : drawables) {
            d.draw();
        }
    }

    public boolean isIntersect(Shape[] shapes, Rectangle otherRectangle) {
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                Rectangle rect = (Rectangle) shape;
                if (rect.intersects(otherRectangle)) {
                    return true;
                }
            }
        }
        return false;
    }
}
