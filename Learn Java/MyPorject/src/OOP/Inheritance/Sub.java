package OOP.Inheritance;

public class Sub extends Main{
    
    public String name;
    public int noOfStu;

    Sub(String n , int nOS){
        super("Colombo" , 10);
        name =n;
        noOfStu = nOS;
    }

    public String getName(){
        return name;
    }

    public int getNOofStu(){
        return noOfStu;
    }

    

}
