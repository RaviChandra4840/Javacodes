public class Weather {
    public static void main(String[] args) {
        double noon = 77;
        double evening = 61;
        double midnight = 55;
        double noonc = fahrenheitToCelsius(noon);
        double eveningc = fahrenheitToCelsius(evening);
        double midnightc = fahrenheitToCelsius(midnight);
        printTemperatures(noon, noonc);
        printTemperatures(evening, eveningc);
        printTemperatures(midnight, midnightc);
    }
    public static double fahrenheitToCelsius(double value){
        double c = (value - 32) * 5/9;
        return c ;
    }
    public static void printTemperatures(double fa, double cel){
        System.out.println("F: " + fa);
        System.out.println("C: " + cel + "\n");
    }
}
