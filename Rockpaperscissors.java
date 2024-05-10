import java.util.Scanner;

public class Rockpaperscissors {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are ");
        String ans = scan.nextLine();
        if(ans.equals("yes")){
            System.out.println("Great!");
            System.out.println("rock -- paper -- scissors, shoot!");
            String pick = scan.nextLine();
            String computerChoice = computerChoice();
            System.out.println("\nYon chose: " + pick);
            System.out.println("The computer chose: " + computerChoice);
            String result = result(pick, computerChoice);
            System.out.println(result);
        }
        else{
            System.out.println("Darn, some other time......");
        }
        scan.close();
    }
    public static String computerChoice() {
        double num = Math.random() * 3;
        switch((int)num){
            case 0: return "rock";
            case 1: return "paper";
            case 2: return "scissors";
            default: return "";
        }
    }
    public static String result(String pick, String computerChoice){
        String result = "";
        if(pick.equals("rock") && computerChoice.equals("scissors")){
            result = "You Win!";
        }
        else if(computerChoice.equals("rock") && pick.equals("scissors")){
            result = "You lose!";
        }
        else if(pick.equals("paper") && computerChoice.equals("rock")){
            result = "You Win!";
        }
        else if(computerChoice.equals("paper") && pick.equals("rock")){
            result = "You lose!";
        }
        else if(pick.equals("scissors") && computerChoice.equals("paper")){
            result = "You Win!";
        }
        else if(computerChoice.equals("scissors") && pick.equals("paper")){
            result = "You lose!";
        }
        else {
            result = "It's a tie!";
        }
        return result;
    }
}
