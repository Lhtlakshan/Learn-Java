package Enum;

public class enummeration2 {

    private String possition;
    private enummeration detail;

    public static void main(String args[]){
        enummeration de = new enummeration("Thilina", "24");
        enummeration2 de2 = new enummeration2("Software engineer", de);

       System.out.println(de2);

        
       //Student enum
       enum3 stu = enum3.LAKSHAN;
       stu.getDetails();

    }

    public enummeration2(String thePossition , enummeration details){
        possition = thePossition;
        detail = details;
    }

    public String toString(){
        return String.format("My name is %s, and my details are %s ", possition , detail);
    }
}
