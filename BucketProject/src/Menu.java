import java.util.Scanner;

public class Menu {
    private final int EXIT_OPTION = 0;
    private Scanner scanner = new Scanner(System.in);
    private Bucket bucket;


    public void displayMenu() {
        int option = -1;
        displayOptions();
        option = readOption();
        processOption(option);
        if (option != EXIT_OPTION) {
            displayMenu();
        }
    }

    private void displayOptions() {
        System.out.println("1. Create Rectangle");
        System.out.println("2. Create Square");
        System.out.println("3. Create Circle");
        System.out.println("4. Create Triangle");
        System.out.println("5. Test Casts");
        System.out.println("6. Create Bucket");
        System.out.println("7. Display Bucket");
        System.out.println("8. Add shape");
        System.out.println("9. Reset Bucket");
        System.out.println("0. Exit");
        System.out.println();
    }

    private int readOption() {
        System.out.print("Option: ");
        return new Scanner(System.in).nextInt();
    }

    private void processOption(int option) {
        switch (option) {
            case 1:
                createRectangle();
                break;
            case 2:
                createSquare();
                break;
            case 3:
                createCircle();
                break;
            case 4:
                createTriangle();
                break;
            case 5:
                testCasts();
                break;
            case 6:
                createBucket();
                break;
            case 7:
                displayBucket();
                break;
            case 8:
                addShape();
                break;
            case 9:
                resetBucket();
                break;
            case 0:
            default:
        }
    }

    private Shape createRectangle() {
        System.out.println("read rectangle width: ");
        Double width = scanner.nextDouble();
        System.out.println("read rectangle height: ");
        Double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        addShapeToBucket(rectangle);
        System.out.println(rectangle);
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());
        return rectangle;
    }

    private Shape createSquare() {
        System.out.print("Read square side: ");
        Double side = scanner.nextDouble();
        Square square = new Square(side);
        addShapeToBucket(square);
        System.out.println(square);
        System.out.println("Square area: " + square.calculateArea());
        System.out.println("Square perimeter: " + square.calculatePerimeter());
        return square;
    }

    private Shape createCircle() {
        System.out.print("read circle radius: ");
        Double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        addShapeToBucket(circle);
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());
        return circle;
    }

    private Shape createTriangle() {
        System.out.print("read triangle L1: ");
        Double L1 = scanner.nextDouble();
        System.out.print("read triangle L2: ");
        Double L2 = scanner.nextDouble();
        System.out.print("read triangle L3: ");
        Double L3 = scanner.nextDouble();
        Triangle triangle = new Triangle(L1, L2, L3);
        addShapeToBucket(triangle);
        System.out.println(triangle);
        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
        return triangle;
    }

    private void testCasts() {
        System.out.println("Not available!!!");

    }

    private void createBucket() {
        System.out.println("Please input bucket size:");
        int bucketSize = scanner.nextInt();
        this.bucket = new Bucket(bucketSize);
    }

    private boolean bucketExists(){
        if(this.bucket != null){
            return true;
        } else {
            return false;
        }
    }

    private void addShapeToBucket(Shape shape){
        if(bucketExists()) {
            bucket.addShape(shape);
            System.out.println("Shape added to bucket");
        } else{
            createBucket();
            bucket.addShape(shape);
        }
    }

    private void displayBucket() {
        if (bucketExists()) {
            this.bucket.displayShapes();
        } else {
            System.out.println("Bucket not created");
        }
    }

    private void addShape() {
        String shapeName = scanner.nextLine();
        Shape newShape = null;
        if (shapeName != null) {
            switch (shapeName) {
                case "rectangle":
                    newShape = createRectangle();
                    break;
                case "square":
                    newShape = createSquare();
                    break;
                case "triangle":
                    newShape = createTriangle();
                    break;
                case "circle":
                    newShape = createCircle();
                    break;
                default:
                    break;
            }
        }

    }

    private void resetBucket() {
        this.createBucket();
    }
}
