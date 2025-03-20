class Seat{
     int seatNumber;
     int rowNumber;
     double price;
     boolean isBooked;
     String type;

     Seat(int seatNumber,int rowNumber, double price,String type){
          this.seatNumber=seatNumber;
          this.rowNumber=rowNumber;
          this.price=price;
          this.type=type
          
}      
     public boolean bookSeat(){
          if (!isBooked) {
          isBooked=true;
          return true; 
}else{
          return false;  
}
   
}

 public displaySeat(){
        System.out.println(" seatNumber: " + seatNumber);
        System.out.println(":rowNumber " + rowNumber);
        System.out.println("price: " + price);
        System.out.println("type: " + type);
        System.out.println(isBooked ? "Booked" : "Available");
}
}