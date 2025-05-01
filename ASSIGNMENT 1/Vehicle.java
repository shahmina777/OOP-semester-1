class Vehicle {
    String licensePlate;
    String type;
    Owner owner;

    Vehicle(String licensePlate, String type, Owner owner) {
        this.licensePlate = licensePlate;
        this.type = type;
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String toString() {
        return "[License Plate: " + licensePlate + ", Type: " + type + ", Owner: " + owner + "]";
    }
}
