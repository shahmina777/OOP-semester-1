public class Person{
    

  private String name;
  private Address address;

  Person(String name,Address address){
     this.name=name;
     this.address=address;

}
 Person(Person other){
     this.name=other.name;
     this.address=other.address;

}

void showPerson(){
      System.out.println("Name :"+name);
      System.out.println("Address: "+address);


}


}