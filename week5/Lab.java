public class Lab {
    private String labName;
    private String staffName;
    private int noPc;

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public void setNoPc(int noPc) {
        this.noPc = noPc;
    }

    public String getLabName() {
        return labName;
    }

    public String getStaffName() {
        return staffName;
    }

    public int getNoPc() {
        return noPc;
    }

    public void displayLab() {
        System.out.println("Lab Name: " + labName);
        System.out.println("Staff Name: " + staffName);
        System.out.println("No of PCs: " + noPc);
    }
}
