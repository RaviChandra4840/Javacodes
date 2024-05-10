public class WeatherNetwork {
    public static void main(String[] args) {
        int day = 3;
        boolean holiday = false;
        if((day > 0 && day < 6) && !holiday){
            System.out.println("Wake up at 7:00 :( ");
        }
        else if(((day>5 && day<8)) && holiday){
            System.out.println("It's the weekend, no work!");
        }
        else{
            System.out.println("Woohoo, no work");
        }
    }
}
