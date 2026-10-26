package Selection_stmt;

public class Licensedemo {
    public static void main(String[] args) {
        int age = 7;
        boolean hasLicense = false;
         
        if(age >= 18){
            if(hasLicense == true)
            {
                System.out.println("You can Drive");
            }else{
                System.out.println("You need License");
      
            }
        }else{
            System.out.println("You are Underage");
        }
    }      
}
