package project;

/*
* This class prints the given message on console.
*/

public class messageUtil {

   private String message;

   //Constructor
   //@param message to be printed
   public messageUtil(String message){
      this.message = message;
   }
      
   // prints the message
   public String printMessage(){
      System.out.println(message);
      return message;
   }   
}