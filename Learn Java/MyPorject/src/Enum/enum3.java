 package Enum;
 
 public enum enum3{
    LAKSHAN("Science",24),
    JAGATH("maths", 25);

    private final String SUB;
    private final int AGE  ;

    enum3(String sub , int age){
        SUB = sub;
        AGE = age;
    }

    public void getDetails(){
         System.out.printf("%s %a" , SUB , AGE);
    }
    
   


}