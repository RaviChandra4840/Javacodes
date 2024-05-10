import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello. What is your name? ");
        String name = scan.nextLine();

        System.out.println("\nHi " + name + "! I'm Javabot. Where are you from?");
        String place = scan.nextLine();

        System.out.println("\nI hear it's beautiful at " + place + "! I'm from a place called Oracle \nHow old are you?");
        int age = scan.nextInt();

        System.out.println("\nSo you're " + age + ", cool! I'm 400 years old.\nThis means I'm " + (400/age) + " times older than you.");
        System.out.println("\nEnough about me. What's your favourite language? (Just don't say python) ");
        scan.nextLine();
        String lang = scan.nextLine();

        System.out.println("\n"+lang + ", that's great! Nice chatting with you " + name + ". I have to log off now. See ya!");
        
        scan.close();
    }
}
