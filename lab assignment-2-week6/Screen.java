class Screen{
  int screenNumber;
  String movieTitle;
  Seat seats[][];

 Screen(int screenNumber,String movieTitle,int rows,int cols){
   this.screenNumber=screenNumber;
   this. movieTitle= movieTitle;
   this.seats= new Seat[rows][cols];

   for(int i;i<rows,i++){
   for(int j;j<cols;j++){
   seats[i][j]=new Seat(i,j,10.0)

} 

}
    
}
 public boolean bookSeat(int row,int cols,Customer customer){
 if (row<0 || row >= seats.length || cols <0 || cols >= seat[0].length ){
 system.out.println("invalid seat selection")
 return false;
}
if (seats[row][cols].bookSeat()){
  system.out.println("Seat (" + row + "," + col + ") booked for " + customer.getName());
            return true; 
}else{
 system.out.println("Seat (" + row + "," + col + ") id already booked);
            return false; 

}

}


}