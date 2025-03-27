public class Teacher extends Person {
    private String subject;
    private String teacherId;

    public Teacher(String name, int age, String subject, String teacherId) {
        super(name, age);
        this.subject = subject;
        this.teacherId = teacherId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Teacher) {
            Teacher other = (Teacher) obj;
            return this.teacherId.equals(other.teacherId);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Teacher: " + name + ", Age: " + age + ", Subject: " + subject + ", ID: " + teacherId;
    }
}

