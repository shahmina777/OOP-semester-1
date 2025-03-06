public class Date{

  private int day;
  private int month;
  private int year;

  Date(int day, int month, int year{
     this.day=day;
     this.month=month;
     this.year=year;

}
 Date(Date other){
    this.day=other.day;
    this.month=other.month;
    this.year=other.year;

}

void showDate(){
      System.out.println("Day: "+day);
      System.out.println("Month: "+month);
      System.out.println("Year: "+year);


}
}