import java.util.Scanner;

public class Delimiters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        String ans = scan.nextLine();
        if(ans.equals("yes")){
            System.out.println("\nGreat! In one line" + "\nHow much money do you have in your savings?" +  "\nAnd, how much do you owe in credit card debt?");
        }
        else{
            System.out.println("\nOK. Have a nice day!");
            
        }
        int value1 = scan.nextInt();
        int value2 = scan.nextInt();
        System.out.println("\nHow many years have you worked for?");
        int work = scan.nextInt();
        System.out.println("What is your name?");
        scan.nextLine();
        String name = scan.nextLine();

        if (value1 >= 10000 && value2 <= 5000  && work >= 2){
            System.out.println("Congratulations " + name + ", you have been approved!");
        }
        else{
            System.out.println("Sorry, you are not eligible for a mortgage");
        } 
        scan.close();

    }
}
