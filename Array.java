import java.util.Arrays;

/* 
public class Array {
    public static void main(String[] args) {
        double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
        //System.out.println("Celsius: " + Arrays.toString(celsius));
        double[] faHrenheit = celsiusToFahrenheit(celsius);
        //System.out.println("Fahrenheit: " + Arrays.toString(faHrenheit));
        printTemperatures(celsius, "Celsius");
        printTemperatures(faHrenheit, "Fahrenheit");
    }
    public static double[] celsiusToFahrenheit(double[] celsius1){
        double[] fahrenheit = new double[celsius1.length];
        for(int i=0;i<celsius1.length;i++){
            fahrenheit[i] = (celsius1[i]/5 * 9) + 32;
        }
        return fahrenheit;
    }
    public static void printTemperatures(double[] array, String type){
        System.out.print(type + ": ");
        for(int j=0 ;j<array.length;j++){
            System.out.print(String.format("%.2f", array[j]) + " ");
        }
        System.out.println("\n");
    }

}
*/
public class Array{
    public static void main(String[] args) {
        int[] ticket1 = {34,43,45,65,21,54};
        int[] ticket2 = Arrays.copyOf(ticket1, ticket1.length);
        ticket2[2] = 54;
        //System.out.println(Arrays.toString(ticket1));
        //System.out.println(Arrays.toString(ticket2));
        System.out.print("Ticket 1 Numbers: " );
        printTicketNumbers(ticket1);
        System.out.print("Ticket 2 numbers: ");
        printTicketNumbers(ticket2);
    }
    public static void printTicketNumbers(int[] ticket){
        //System.out.print("Ticket numbers: ");
        for(int i=0 ;i<ticket.length;i++){
            System.out.print(ticket[i] + " ");
        }
        System.out.println("\n");
    }
}