package Enum;
// enum people{
//     THILINA;
// } can also be created outside of function
// enum cannot create an object
//constant variables with values
public class enum1 {
    enum people{
    THILINA;
  } 

    public static final String NAME = "Thilina"; //same as enum class variable
   public static void main(String args[]){
    System.out.println(NAME);
    System.out.println(people.THILINA);
   }     
    
}
