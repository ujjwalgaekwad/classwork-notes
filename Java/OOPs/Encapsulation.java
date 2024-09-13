package Oops;

class Account{
   public String name;  
   protected String email;
   private String password;

   //getters and setters

   public String getpassword(){
      return this.password;
   }

   public void setpassword(String fpassword){
     this.password = fpassword;
   }
}
public class Encapsulation {
    public static void main(String[] args) {
        Account account1 = new Account();
        //public access 
        account1.name = "ujjwal singh";
        System.out.println(account1.name);

        //protected access
        account1.email = "ujjwalsinghgaekwad@gmail.com";
        System.out.println(account1.email);

        //private access
        account1.setpassword("1u2j3j4w5a6l");
        System.out.println(account1.getpassword()); 
    } 
}
