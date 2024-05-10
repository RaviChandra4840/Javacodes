public class ParkingManagementSystem {
    public static void main(String[] args) {
        // Create a parking lot with capacity for 10 vehicles
        // ParkingLot parkingLot = new ParkingLot(10);
        ParkingLot parkingLot = new ParkingLot(10);
        // Park a vehicle
        parkingLot.park("ABC123", "A1");

        // Check availability of parking spots
        System.out.println("Parking available? " + parkingLot.isParkingAvailable());

        // Get parking spot of a parked vehicle
        String parkingSpot = parkingLot.getParkingSpot("ABC123");
        System.out.println("Parking spot of ABC123: " + parkingSpot);

        // Remove a parked vehicle
        parkingLot.remove("ABC123");

        // Check the number of occupied parking spots
        System.out.println("Occupied spots count: " + parkingLot.getOccupiedSpotsCount());
    }
}