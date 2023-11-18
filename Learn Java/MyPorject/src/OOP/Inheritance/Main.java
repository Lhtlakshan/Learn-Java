package OOP.Inheritance;

public class Main {
    
    public String UniName;
    public int noOfFaculty;

    Main(String n ,int noFa){
         UniName = n;
         noOfFaculty = noFa;
    }

    public String getUniName(){
        return UniName;
    }

    public int getNoOfFaculty(){
        return noOfFaculty;
    }
}
