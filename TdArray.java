import java.util.Scanner;

public class TdArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("***********JavaPedia***********");
        System.out.println("How many historical figures will you register?");
        int x = scan.nextInt();
        scan.nextLine();
        String[][] database = new String[x][3];
        for(int i=0;i<x;i++){
            System.out.println("\tFigure " + (i+1));
            System.out.print("\t   - Name: ");
            database[i][0] = scan.nextLine();
            System.out.print("\t   - Date of birth: ");
            database[i][1] = scan.nextLine();
            System.out.print("\t   - Occupation: ");
            database[i][2] = scan.nextLine();

        }
        System.out.println("\nThese are the values you stored: ");
        print2DArray(database);
        System.out.print("\nWho do you want information on? ");
        String val = scan.nextLine();
        for(int j=0;j<x;j++){
                if(database[j][0].equals(val)){
                    System.out.println("\tName: "+ database[j][0]);
                    System.out.println("\tDate of birth: " + database[j][1]);
                    System.out.println("\tOccupation: " + database[j][2]);
                }
        }
        scan.close();
    }
    public static void print2DArray(String[][] array){
        for(int i=0;i<array.length;i++){
            System.out.print("\t");
            for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
