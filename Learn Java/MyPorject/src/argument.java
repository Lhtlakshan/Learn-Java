
public class argument{
    public static void main(String args[]){
    
    average(2,4,5);
    
}

public static void average(float...num){
    float total = 0;

    for(float y:num)
       total += y;

    System.out.println("The average is : "+ total/num.length);
}
}