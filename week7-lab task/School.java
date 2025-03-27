public class School {
    private String name;
    private String address;
    private Principal principal;
    private ClassRoom[] classRooms; 
    private int classCount;

    public School(String name, String address, Principal principal) {
        this.name = name;
        this.address = address;
        this.principal = principal;
        this.classRooms = new ClassRoom[10]; 
        this.classCount = 0;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("School: ").append(name).append(", Address: ").append(address).append("\n");
        sb.append(principal).append("\n");
        for (int i = 0; i < classCount; i++) {
            sb.append(classRooms[i]).append("\n");
        }
        return sb.toString();
    }
}
