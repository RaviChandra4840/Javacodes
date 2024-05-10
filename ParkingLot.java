import java.util.HashMap;
class ParkingLot{
    private int capacity; // total capacity of the parking lot
    private int occupied; // number of occupied parking spots
    private HashMap<String, String> parkingMap; // map to store vehicle registration number and corresponding parking spot

    public ParkingLot(int capacity) {
        this.capacity = capacity;
        this.occupied = 0;
        this.parkingMap = new HashMap<>();
    }

    // Method to park a vehicle
    public void park(String vehicleRegistrationNumber, String parkingSpot) {
        if (occupied < capacity) {
            parkingMap.put(vehicleRegistrationNumber, parkingSpot);
            occupied++;
            System.out.println("Vehicle with registration number " + vehicleRegistrationNumber +
                               " parked at spot " + parkingSpot);
        } else {
            //System.out.println("Parking lot is full");
            System.out.println("Parking lot is full");
        }
    }
        public void remove(String vehicleRegistrationNumber) {
            if (parkingMap.containsKey(vehicleRegistrationNumber)) {
                parkingMap.remove(vehicleRegistrationNumber);
                occupied--;
                System.out.println("Vehicle with registration number " + vehicleRegistrationNumber + " removed from parking lot");
            } else {
                System.out.println("Vehicle with registration number " + vehicleRegistrationNumber + " not found in parking lot");
            }
        }
        
        // Method to check the availability of parking spots
        public boolean isParkingAvailable() {
            return occupied < capacity;
        }
        
        // Method to get the parking spot of a parked vehicle
        public String getParkingSpot(String vehicleRegistrationNumber) {
            return parkingMap.get(vehicleRegistrationNumber);
        }
        
        // Method to get the number of occupied parking spots
        public int getOccupiedSpotsCount() {
            return occupied;
        }
        
        // Method to get the total capacity of the parking lot
        public int getCapacity() {
            return capacity;
        }
}