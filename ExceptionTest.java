import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest
{
	int a,b,c;
	Scanner sc;
	public void accept(){
	try{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of a");
		sc.nextInt();
		
		System.out.println("Enter value of b");
		sc.nextInt();
		
		c=a/b;
		System.out.println("Value of c"+ c);
				
	}

	catch(InputMismatchException ee){
		System.out.println("Enter only number" + ee.getMessage());
	}
		
	catch(ArithmeticException aa){
		System.out.println("Dont divide by zero" +aa.getMessage());
	}
	
	finally{
		System.out.println("Program end");
	}
}
	
	public static void main(String[] args) {
		ExceptionTest obj= new ExceptionTest();
		obj.accept();
	}
}
