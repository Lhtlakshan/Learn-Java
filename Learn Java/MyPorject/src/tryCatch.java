import java.util.*;

public class tryCatch {
    
    public static void main(String[] args){
        try{
            Scanner number = new Scanner(System.in);
            System.out.print("Enter number 1 : ");
            float n1 = number.nextInt();

            System.out.print("Enter number 2: ");
            float n2 = number.nextInt();

            float res = n1/n1;
            System.out.println();
            System.out.printf("Divisable value is %f" + res);


        }catch(Exception e){
            System.out.println("You can't do that");
        }
    }
}
