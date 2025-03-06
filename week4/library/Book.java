public class Book{

     private String title;
     private String issn;
     private Date publicationDate;
     private Person author;

     Book(String title,String issn,Date publicationDate,Person author){
         this.title=title;
         this.issn=issn;
         this.publicationDate=publicationDate;
         this.author=author;

    } 
Book(Book other){
         this.title=other.title;
         this.issn=other.issn;
         this.publicationDate=other.publicationDate;
         this.author=other.author;

    } 

  void showBookDetails(){

        System.out.print("Title: "+title);
        System.out.print("Issue number: "+issn);
        System.out.print("Date : "+publicationDate.showDate());
        System.out.print("Author: "+author.showPerson());
 

}
}