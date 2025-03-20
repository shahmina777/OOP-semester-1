public class Computer{

   private int  pcId;
   private  String pcVersion;
   private  int ramSize;
   private int discSize;
  
  Computer(int  pcId, String pcVersion,int ramSize,int ramSize, int discSize){
     this.pcId= pcId;
     this.pcVersion= pcVersion;
     this.ramSize=ramSize;
     this.discSize= pcVersion;
   
} 

 public void setpcId(int pcId) {
        this.pcId =pcId ;
    }

    public void pcVersion(String pcVersion) {
        this.pcVersion = pcVersion;
    }

    public void setramSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public String pcVersion() {
        return labName;
    }

    public String getpcVersion() {
        return pcVersion;
    }

    public int ramSize() {
        return ramSize;
    }

    public void displayLab() {
        System.out.println("Lab Name: " + labName);
        System.out.println("Staff Name: " + staffName);
        System.out.println("No of PCs: " + noPc);
    }
}
}