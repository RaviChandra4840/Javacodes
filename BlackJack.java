import java.util.Scanner;

public class BlackJack {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?\nWe shall see\n..Ready? Press anything to begin");
        scan.nextLine();
        System.out.println("You get a\n");

        int a = randomNumber();
        int b = randomNumber();
        int c = randomNumber();
        int d = randomNumber();

        System.out.println(randomCard(a));

        System.out.println("and a\n");

        String card2 = randomCard(b);
        System.out.println(card2);

        int total = Math.min(a, 10) + Math.min(b, 10);
        System.out.println("Your total: " + total);

        System.out.println("\nThe dealer shows \n");
        System.out.println(randomCard(c));
        System.out.println("\nand has a card facing down\n");
        System.out.println(faceDown());
        System.out.println("The dealer's total is hidden");
        
        int newtotal = total;
        int dealertotal = Math.min(c, 10) + Math.min(d, 10);;

        while(true){
            String play = hitOrStay();
            if(play.equalsIgnoreCase("stay")){
                break;
            }
            int e = randomNumber();
            System.out.println("You get a \n" + randomCard(e));
            newtotal = newtotal + Math.min(e, 10);
            System.out.println("your new total is " + newtotal);
            /* 
            else{
                
                int d = randomNumber();
                String card4 = randomCard(d);
                System.out.println(card4);
                dealertotal = dealertotal +  Math.min(d, 10);
                System.out.println("dealer's total is: " + dealertotal);
                if(dealertotal > 21){
                    System.out.println("Bust! Dealer loses");
                    System.exit(0);
                }
                else if(dealertotal > 17){
                    break;
                }
            }*/
        }
        System.out.println("Dealer's turn \nThe dealer's card are \n");
        System.out.println(randomCard(c));
        System.out.println("\nand a \n");
        System.out.println("Dealer's total is " + dealertotal);
        System.out.println(randomCard(d));
        while (dealertotal < 17) {
            int f = randomNumber();
            dealertotal = dealertotal +  Math.min(f, 10);
            System.out.println("Dealer gets a \n" + randomCard(f));
            System.out.println("Dealer's total is " + dealertotal);
        }
        if(dealertotal > 21){
            System.out.println("Bust! Dealer loses.");
            System.exit(0);
        }

        if(newtotal > dealertotal){
            System.out.println("Players Wins!");
        }/*else if(newtotal < dealertotal){
            System.out.println("Dealer Wins!");
        }*/else{
            System.out.println("It's a tie");
        }
        scan.close();
        
    }

    public static String hitOrStay(){
        System.out.println("Would you like to hit or stay:  ");
        String ans = scan.nextLine();
        while(!(ans.equalsIgnoreCase("hit") || ans.equalsIgnoreCase("stay"))){
            System.out.println("Please write hit or stay: ");
            ans  = scan.nextLine();
        }
        return ans;
    }

    public static int randomNumber(){
        double randomNumber = Math.random() * 13;
        randomNumber += 1;
        return (int)randomNumber;
    }
    public static String randomCard(int x){
        int randomInt = x;
        switch(randomInt){
            case 1:return   "   _____\n"+
                            "  |A _  |\n"+
                            "  | ( ) |\n"+
                            "  |(_'_)|\n"+
                            "  |  |  |\n"+
                            "  |____V|\n";

            case 2: return  "   _____\n"+
                            "  |2    |\n"+
                            "  |  o  |\n"+
                            "  |     |\n"+
                            "  |  o  |\n"+
                            "  |____z|\n";

            case 3: return  "   _____\n"+
                            "  |3    |\n"+
                            "  | o o |\n"+
                            "  |     |\n"+
                            "  |  o  |\n"+
                            "  |____E|\n";

            case 4: return  "   _____\n"+
                            "  |4    |\n"+
                            "  | o o |\n"+
                            "  |     |\n"+
                            "  | o o |\n"+
                            "  |____h|\n";

            case 5: return  "   _____\n"+
                            "  |5    |\n"+
                            "  | o o |\n"+
                            "  |  o  |\n"+
                            "  | o o |\n"+
                            "  |____S|\n";

            case 6: return  "   _____\n"+
                            "  |6    |\n"+
                            "  | o o |\n"+
                            "  | o o |\n"+
                            "  | o o |\n"+
                            "  |____9|\n";

            case 7: return  "   _____\n"+
                            "  |7    |\n"+
                            "  | o o |\n"+
                            "  |o o o|\n"+
                            "  | o o |\n"+
                            "  |____7|\n"; 

            case 8: return  "   _____\n"+
                            "  |8    |\n"+
                            "  |o o o|\n"+
                            "  | o o |\n"+
                            "  |o o o|\n"+
                            "  |____8|\n";

            case 9: return  "   _____\n"+
                            "  |9    |\n"+
                            "  |o o o|\n"+
                            "  |o o o|\n"+
                            "  |o o o|\n"+
                            "  |____6|\n";

            case 10: return "   _____\n"+
                            "  |10  o|\n"+
                            "  |o o o|\n"+
                            "  |o o o|\n"+
                            "  |o o o|\n"+
                            "  |___10|\n";

            case 11: return "   _____\n"+
                            "  |J  ww|\n"+
                            "  | o {}|\n"+
                            "  |o o% |\n"+
                            "  |  | %|\n"+
                            "  |___%%|\n";

            case 12: return "   _____\n"+
                            "  |Q  ww|\n"+
                            "  | o {(|\n"+
                            "  |o o%%|\n"+
                            "  |  |%%|\n"+
                            "  |_%%%0|\n";

            case 13: return "   _____\n"+
                            "  |K  WW|\n"+
                            "  | o {}|\n"+
                            "  |o o%%|\n"+
                            "  | |%%%|\n"+
                            "  |_%%%>|\n";

            default: return "This should never get called";


        }
    }

    public static String faceDown(){
        return  "   _____\n"+
                "  |     |\n"+
                "  |  J  |\n"+
                "  | JJJ |\n"+
                "  |  J  |\n"+
                "  |_____|\n";
    }
}
