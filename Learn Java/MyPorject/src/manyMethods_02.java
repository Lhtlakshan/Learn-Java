import java.util.Scanner;

public class manyMethods_02{

    public static void main(String args[]){

    }

    private String myName;

    public manyMethods_02(String name){
        myName = name;
    }

    public String setName(){
        return myName;
    }
    public void printname(){
        System.out.println("My name is "+ setName());
    }

}