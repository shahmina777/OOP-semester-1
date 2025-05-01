class Supervisor extends Person {
    int experience;

    Supervisor(String name, int experience) {
        super(name);
        this.experience = experience;
    }

    public String toString() {
        return "Supervisor: Name: " + name + ", Experience: " + experience + " years";
    }
}
