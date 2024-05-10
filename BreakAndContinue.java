//import java.util.Scanner;

public class BreakAndContinue {
    public static void main(String[] args) {
        int points = 0;
        //Scanner scan = new Scanner(System.in);
        System.out.println("Let's play Rolling Java. Type anything to start.\n");
        System.out.println("Great, here are the rules: \n > If you roll a 6 the game stops.\n > If you roll a 4 nothing happens. \n> Otherwise, you get 1 point.\n");
        System.out.println("You must collect at least 3 points to win. Enter anything to roll: ");
        while(true){
            //int x = scan.nextInt();
            int diceRoll = rollDice();
            System.out.println("You rolled a " + diceRoll);
            if(diceRoll == 6){
                System.out.println("End of game.");
                break;
            }else if(diceRoll == 4){
                System.out.println("Zero points. Keep rolling.");
                break;
            }
            else{
                points++;
                System.out.println("One point. Keep rolling.");
            }
        }
        if(points >= 3){
            System.out.println("Wow, that's lucky. You win!");
        }
        else{
            System.out.println("Tough luck, you lose :(");
        }
    }
    public static int rollDice(){
        return (int)(Math.random() * 7);
    }
}
