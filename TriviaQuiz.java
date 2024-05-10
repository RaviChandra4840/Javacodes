import java.util.Scanner;

public class TriviaQuiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        System.out.println("1. Which country held the 2016 Summer Olympics?");
        System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
        String ans1 = scan.nextLine();
        if(ans1.equals("c")){
            count++;
        }

        System.out.println("2. Which Planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        String ans2 = scan.nextLine();
        if(ans2.equals("a")){
            count++;
        }

        System.out.println("3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
        String ans3 = scan.nextLine();
        if(ans3.equals("d")){
            count++;
        }

        System.out.println("4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
        String ans4 = scan.nextLine();
        if((ans4.equals("a") || ans4.equals("b"))){
            count++;
        }

        System.out.println("Your output should reflect a score of " + count*5 + "/20.");
        if(count*5 >= 15){
            System.out.println("Wow, you know your stuff!");
        }
        else if(count*5 < 15 && count*5 >= 5){
            System.out.println("Not bad!");
        }
        else{
            System.out.println("better luck next time.");
        }
        scan.close();
    }
}
