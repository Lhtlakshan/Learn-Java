package Array;

public class array{
    public static void main(String args[]){
       
       int arr[] = new int[10];
       int arr2[] = {12,56,45,67,89};

       System.out.println("array 1 \n");

       for(int i=0; i<10 ; i++){
          arr[i] = i+10;
          System.out.print(arr[i]+ "\t");
       }

       System.out.println("\n\n");

       System.out.println("array 2 \n");

       for(int x:arr2)
          System.out.print(x + "\t");
       


    }


}