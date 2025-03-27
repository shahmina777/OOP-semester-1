public class ClassRoom {
    private String className;
    private String classCode;
    private Teacher teacher; 
    private Student[] students;
    private int studentCount;

    public ClassRoom(String className, String classCode, Teacher teacher) {
        this.className = className;
        this.classCode = classCode;
        this.teacher = teacher;
        this.students = new Student[5]; 
        this.studentCount = 0;
    }

 

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ClassRoom: ").append(className).append(" (").append(classCode).append(")\n");
        sb.append("  ").append(teacher).append("\n");
        sb.append("  Students:\n");
        for (int i = 0; i < studentCount; i++) {
            sb.append("    ").append(students[i]).append("\n");
        }
        return sb.toString();
    }
}
