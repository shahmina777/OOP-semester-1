public class Principal extends Person {
    private int experienceYears;

    public Principal(String name, int age, int experienceYears) {
        super(name, age);
        this.experienceYears = experienceYears;
    }

    @Override
    public String toString() {
        return "Principal: " + name + ", Age: " + age + ", Experience: " + experienceYears + " years";
    }
}
