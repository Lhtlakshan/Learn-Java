import java.util.Random;

public class math{
    public static void main(String args[]){

        Random x = new Random();

        int y;
        
        System.out.println("The random numbers are : ");

        for(int i=0; i<=5; i++){
            y = 1+x.nextInt(5);
            System.out.print(y + " ");
        }
        
        System.out.println("SQRT is : "+ Math.ceil(Math.sqrt(20)));


    }
}