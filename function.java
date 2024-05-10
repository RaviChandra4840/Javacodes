public class function {
    public static void main(String[] args) {
        double square = areaSquare(8);
        double rectangle = areaRectangle(-1, 2);
        double triangle = areaTriangle(3, 2);
        double circle = areaCircle(20);

        printAreas(square, rectangle, triangle, circle);

    }
    public static double areaSquare(double side){
        if(side < 0 ){
            System.out.println("Impossible");
            System.exit(0);
        }
        return side * side;
    }
    public static double areaRectangle(double length, double width){
        if(length < 0 || width < 0){
            System.out.println("Impossible");
            System.exit(0);
        }
        return length * width;
    }
    public static double areaTriangle(double base , double height){
        if(base<0 || height < 0){
            System.out.println("Impossible");
            System.exit(0);
        }
        return (base * height) / 2;
    }
    public static double areaCircle(double raidus){
        if(raidus < 0 ){
            System.out.println("Impossible");
            System.exit(0);
        }
        return Math.PI * raidus * raidus;
    }
    public static void printAreas(double sq, double re, double tri, double ci){
        System.out.println("Square area: "+ sq);
        System.out.println("Rectangle area: " + re);
        System.out.println("Triangle area: " + tri);
        System.out.println("Circle area: " + ci);
    }
}
