package Array;
public class multiDimArray{

    public static void main(String args[]){

        int arr[][] = new int[3][3];
        int arr2[][] = {{2,3,5},{4,5,7},{6,7,4}};

        for(int i=0; i<3; i++){

            for(int j=0; j<3; j++){

                arr[i][j] = i+j+10;
                System.out.print(arr[i][j] + "\t");

            }
            System.out.println("\n");

        }

        display(arr2);
 
        

    }

    public static void display(int x[][]){
        for(int r = 0; r < x.length; r++){

            for(int c=0; c < x[r].length; c++){

                System.out.print(x[r][c] + "\t");

            }
            System.out.println("\n");

        }
    }

}