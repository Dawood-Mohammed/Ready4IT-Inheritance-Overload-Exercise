public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Shape shape2 = new Shape(5);
        Shape shape3 = new Shape(4, 10);
        Shape shape4 = new Shape(4, 6, 3);
        Shape shape5 = new Shape(3, 5, 5, 5);
        String shapeDetails1 = shape1.getShapeDetails();
        String shapeDetails2 = shape2.getShapeDetails();
        String shapeDetails3 = shape3.getShapeDetails();
        String shapeDetails4 = shape4.getShapeDetails();
        String shapeDetails5 = shape5.getShapeDetails();
        System.out.println(shapeDetails1);
        System.out.println(shapeDetails2);
        System.out.println(shapeDetails3);
        System.out.println(shapeDetails4);
        System.out.println(shapeDetails5);
    }
}
