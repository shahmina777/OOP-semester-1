class Owner extends Person {
    static int idCounter = 1;
    int ownerId;

    Owner(String name) {
        super(name);
        this.ownerId = idCounter++;
    }

    public String toString() {
        return "[Name: " + name + ", Owner ID: " + String.format("%04d", ownerId) + "]";
    }
}
