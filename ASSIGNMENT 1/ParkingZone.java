class ParkingZone {
    static int counter = 1;
    String zoneId;
    Vehicle[] vehicles = new Vehicle[5];
    int count = 0;

    ParkingZone() {
        zoneId = "A" + counter++;
    }

    boolean addVehicle(Vehicle v) {
        for (int i = 0; i < count; i++) {
            if (vehicles[i].getLicensePlate().equals(v.getLicensePlate())) {
                System.out.println("Error: Duplicate license plate '" + v.getLicensePlate() + "' is not allowed.");
                return false;
            }
        }
        if (count < 5) {
            vehicles[count++] = v;
            return true;
        }
        return false;
    }

    public String toString() {
        String result = "Zone ID: " + zoneId + ", Vehicles: ";
        for (int i = 0; i < count; i++) {
            result += vehicles[i] + "; ";
        }
        return result;
    }
}
