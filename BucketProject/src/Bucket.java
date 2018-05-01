
public class Bucket {
    private int nrOfShapes = 0;

    private Shape[] shapes;

    public Bucket(int bucketSize) {
        shapes = new Shape[bucketSize];
    }

    public void displayShapes() {
        System.out.println("bucket has " + nrOfShapes + " items");
        for (int i = 0; i < nrOfShapes; i++) {
            Shape shape = shapes[i];
            if (shape != null) {
                System.out.println(shape);
                System.out.println(shape.calculateArea());
                System.out.println(shape.calculatePerimeter());
            }
        }
    }

    public void addShape(Shape shape) {
        if (nrOfShapes >= shapes.length) {
            System.out.println("Bucket is full. Please empty.");
            return;
        }
        shapes[nrOfShapes] = shape;
        nrOfShapes++;
    }

}
