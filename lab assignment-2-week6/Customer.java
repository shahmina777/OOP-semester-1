class Customer{
   int customerId;
   String name;
   String phoneNumber;
   String email;
 
Customer( int customerId, String name,  String phoneNumber,  String email){
   this.customerId= customerId;
   this.name=name;
   this.phoneNumber=phoneNumber;
   this.email=email;
}
   boolean  

  displayCustomer(){
        System.out.println("customerId: " +  customerId);
        System.out.println("name " + name);
        System.out.println("phoneNumber" +  phoneNumber);
        System.out.println("email" +  email);

}
   public String getName() {
        return name;
    }

}