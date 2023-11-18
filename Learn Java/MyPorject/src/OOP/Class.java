package OOP;

public class Class {
    private String name;
    private int age;
    private String district;

    Class(String n,int a,String d){ // constructor no have any retur(n) type and same name of class name and create at build an object
        name = n;
        age = a;
        district = d;

    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getDistrict(){
        return district;
    }

}



