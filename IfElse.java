public class IfElse {
    public static void main(String[] args) {
        int gryfindor = 100;
        int ravenclaw = 500;
        int margin = gryfindor - ravenclaw;
        if(margin >= 300){
            System.out.println("Grffindor takes the house cup!");
        }
        else if(margin >= 200){
            System.out.println("In second place, Gryffindor!");
        }
        else if(margin >= 100){
            System.out.println("In the third place, Grffindor!");
        }
        else{
            System.out.println("In fourth place, Gryffindor!");
        }
    }
}
