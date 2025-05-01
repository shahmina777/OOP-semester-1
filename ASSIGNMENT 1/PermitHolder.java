class PermitHolder extends Person {
    static int id = 1000;
    int permitId;

    PermitHolder(String name) {
        super(name);
        permitId = id++;
    }

    public String toString() {
        return "[Name: " + name + ", Permit ID: " + permitId + "]";
    }
}
