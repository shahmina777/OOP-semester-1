package users;
import java.io.
import java.util.Scanner;
class UserManager
{
 
 static final String storedUsername="ali";
 static final String storedPassword="12345";
  
  
static boolean authenticate(String username,String password) 
{
  if(storedUsername.equals(String username)&& storedPassword.equals(String password)){
     System.out.println("Access is valid.")
}else{
      System.out.println("Access is denied.")
  

}


}
}