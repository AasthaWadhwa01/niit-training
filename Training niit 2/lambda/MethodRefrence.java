package lambda;

import java.util.Arrays;
import java.util.List;

public class MethodRefrence {
	public static void main(String[] args) {
List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		list.forEach(MethodRefrence::printWithHello);
		
	}
public static void printWithHello(int a){
	System.out.println("Hello" + a);
}
}
