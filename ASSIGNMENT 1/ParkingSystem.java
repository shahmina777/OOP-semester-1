class ParkingSystem {
    static ParkingSystem instance = null;
    Supervisor supervisor;
    ParkingZone[] zones = new ParkingZone[10];
    PermitHolder[] permits = new PermitHolder[10];
    int zoneCount = 0;
    int permitCount = 0;

    private ParkingSystem(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    static ParkingSystem getInstance(String name, Supervisor supervisor) {
        if (instance == null) {
            instance = new ParkingSystem(supervisor);
        } else {
            System.out.println("Warning: ParkingSystem instance already exists. Returning existing instance.");
        }
        return instance;
    }

    void addZone(ParkingZone z) {
        zones[zoneCount++] = z;
    }

    void addPermitHolder(PermitHolder p) {
        permits[permitCount++] = p;
    }

    public String toString() {
        String result = "Campus: CIIT Lahore\n";
        result += supervisor + "\n";
        for (int i = 0; i < zoneCount; i++) {
            result += zones[i] + "\n";
        }
        result += "Permit Holders: ";
        for (int i = 0; i < permitCount; i++) {
            result += permits[i] + "; ";
        }
        return result;
    }
}
