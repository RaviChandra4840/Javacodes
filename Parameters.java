public class Parameters {
    public static void main(String[] args) {
        /*measureRectangle(4.3,2.2);
        measureRectangle(3.2,4.1);
        measureRectangle(9.5,8.2);
        measureRectangle(0.2,1);
        measureRectangle(5,9);
        */
        tipTheWaiter(53.50);
    }
    /*public static void measureRectangle(double length, double width){
        double area = length * width;
        System.out.println("The area of Rectanlge with length " + length + " and width " + width + ": "+ area + "\n");
    }*/
    public static void tipTheWaiter(double bill){
        double x = bill * 10;
        double y = x + (x/2);
        double tip = y /100;
        System.out.println("Waiter: I hope you enjoyed your meal!");
        System.out.println("Thank you!\nYour service was wonderful! Please, accept this tip: " + tip);
    }
}
