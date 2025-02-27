package main;
import util.PasswordValidator;
import java.io.Console;
import java.util.Scanner;
import users.UserManager;

public class LoginSystem
{
  
public static void main(String[] args){
      Console console =System.console;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter username:");
      sc.next;
      System.out.print("enter password");
      Console.readPassword;
  if(UserManager.authenticate(username,password)){
      System.out.println("login successful"); 
}else{

      System.out.println("no login done"); 
}
      

}


}