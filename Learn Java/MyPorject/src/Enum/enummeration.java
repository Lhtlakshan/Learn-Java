package Enum;

public class enummeration {

    private String name;
    private String age;
    
    public static void main(String args[]){
       
        
    }

    public enummeration(String n , String a){
       name = n;
       age = a;

       System.out.println(this);
    }

    public String toString(){
        return String.format("%s %s" , name , age);
    }

}
