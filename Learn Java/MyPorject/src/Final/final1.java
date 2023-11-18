package Final;
public class final1 {

    private String fname;
    private String lname;
    private int age;
    
    private final int AGE;
    private static int mem;
    
    // final1(String fn, String ln , int a){
    //     fname = fn;
    //     lname = ln;
    //     age = a;
    //     mem++;
    //     System.out.printf("%s %s %d" , fname,lname,age);
    // }

    final1(int a){
        AGE = a;
    }

    public void add(){
        age += AGE;
        System.out.println(age);
    }

    
}
