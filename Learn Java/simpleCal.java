import java.util.Scanner;

public class simpleCal{
	public static void main(String args[]){
		Scanner num  = new Scanner(System.in);
		double n1, n2 , sum;
		double[] n = new double[5];
		
		System.out.print("Enter no 1 : ");
		n1 = num.nextDouble();
		
		System.out.print("Enter no 2 : ");
		n2 = num.nextDouble();
		
		sum = n1+n2;
		
		System.out.println("Answer is : "+ sum);
		
		double sum2 = 0;
		
		for(int i = 0;i<5;i++){
			System.out.print("Enter no "+ i + " :");
		    n[i] = num.nextDouble();
			sum2 += n[i];
		}
		
		System.out.println("Answer array is : "+ sum2);
	}
	
}