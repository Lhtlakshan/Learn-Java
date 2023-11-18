import java.util.Scanner;

public class condition{
	
	public static void main(String[] args) {
	 
	 Scanner age = new Scanner(System.in);
	 double type;
	 
	 System.out.print("Enter your age : ");
	 type = age.nextDouble();
	 
	  if(type < 10 )
		System.out.println("Child");
	 else if(type < 20){
		System.out.println("Teenagers");
	 }else if(type < 30){
		System.out.println("Youth");
	 }else if(type < 40){
		System.out.println("Middle");
	 }else if(type < 60){
		System.out.println("Elders");
	 }
	 
	 
	//  switch(type){
	// 	case 15.56 :
    //         System.out.println("Hi");       
    //         break;			
	// 	default :
    //         System.out.println("he he");
    //         break;				
	//   }
	 
	 
	 
}
}

