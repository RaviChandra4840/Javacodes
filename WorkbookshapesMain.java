import Workbookshapes.*;


public class WorkbookshapesMain {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(2.0);
        cylinder.setRadius(1.0);

        Sphere sphere = new Sphere();
        sphere.setRadius(1.0);

        System.out.println("Shpere - radius: " + sphere.getRadius());
        System.out.println("Cylinder - radius: " + cylinder.getRadius()+ "\nheight: " + cylinder.getHeight());

        double area = Shape.getArea();
        double volume = Shape.getVolume();
        System.out.println("Area: " + area);
        System.out.println("Volume: " + volume);
    }

}
