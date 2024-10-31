public class Shape {
    String shapeName;
    int numberOfEdges;
    public Shape(){
        System.out.println("Shape instance is created");
        this.shapeName = "Undefined";
    }
    public Shape(double radius){
        System.out.println("Shape instance is created");
        this.shapeName = "Circle";
    }
    public Shape(int edges, double edgeLength){
        System.out.println("Shape instance is created");
        this.shapeName = "Square";
        this.numberOfEdges = edges;
    }
    public Shape(int edges, double e1, double e2){
        System.out.println("Shape instance is created");
        this.shapeName = "Rectangle";
        this.numberOfEdges = edges;
    }
    public Shape(int edges, double e1, double e2, double e3){
        System.out.println("Shape instance is created");
        this.shapeName = "Square";
        this.numberOfEdges = edges;
    }
    public String getShapeDetails(){
        return String.format("Shape name: %s, Number of edges: %d", shapeName, numberOfEdges);
    }
}

