class Ticket{
  int ticketId;
  Customer customer;
  int seatNumber;
  String movieTitle;
  double price; 

Ticket(int ticketId, Customer customer,int seatNumber, String movieTitle,double price){
 this.ticketId=ticketId;
 this.customer=customer;
 this.seatNumber= seatNumber;
 this.movieTitle=movieTitle;
 this.price=price;
} 
 display Ticket(){

        System.out.println("ticketId: " +  ticketId);
        System.out.println("customer" + displayCustomer());
        System.out.println("seatNumber" +  seatNumber);
        System.out.println("movieTitle" +  movieTitle);
        System.out.println("price" +  price);



}
} 