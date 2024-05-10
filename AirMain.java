

public class AirMain {
    public static void main(String[] args) {

        AirPerson p1 = new AirPerson( "Rayan Slim","Canadian", "01/01/1111", 5);
        p1.chooseSeat();
        System.out.println("Name: " + p1.name + "\n" + "Nationality: " + p1.nationality + "\n" + "Date of Birth: " + p1.dateOfBirth + "\n" + "Seat Number: " + p1.seatNumber + "\n");


        // AirPerson p2 = new AirPerson(p1);
        // p2.setName("Ravi");
        // p2.setseatNumber(3);
        // System.out.println("Name: " + p2.name + "\n" + "Nationality: " + p2.nationality + "\n" + "Date of Birth: " + p2.dateOfBirth + "\n" + "Seat Number: " + p2.seatNumber + "\n");


    }
}
