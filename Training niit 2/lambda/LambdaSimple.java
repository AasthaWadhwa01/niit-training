package lambda;

public class LambdaSimple {
	public static void main(String[] args){
		Thread t= new Thread(()->System.out.println("Inside thread"));  // -> lambda
		t.start();
	}

}
