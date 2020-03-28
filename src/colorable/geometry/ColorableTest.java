package colorable.geometry;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("Black-White", false, 17.6);
        shapes[1] = new Rectangle(36.6, 29.9, "Blue", true);
        shapes[2] = new Square(14.1, "Orange", true);

        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                IColorable iColorable = (Square) shape;
                iColorable.howToColor();
            }
            else
                System.out.println(shape + " Not is Square, so can not use How to Color!");
        }
    }
}
