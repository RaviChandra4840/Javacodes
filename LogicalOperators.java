public class LogicalOperators {
    public static void main(String[] args) {
        int chemistryGrade = 78;
        int englishGrade = 65;
        String language = "java";

        if(chemistryGrade>75 || englishGrade>75 || language.equals("java")){
            System.out.println("Congratulations, you got the scholarship!");
        }
        else{
            System.out.println("we're sorry you didn't get the scholarshhip");
        }

        int credits = 56;
        double GPA = 1.2;
        if(credits >= 40 && GPA >= 2.0){
            System.out.println("You earned your diploma!");
        }
        else{
            System.out.println("sorry, you need at least 40 creditts and a minimum 2.0GPA");
        }
    }
}
