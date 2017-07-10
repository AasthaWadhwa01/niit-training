package lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaConsumer {
	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		list.forEach(System.out::println);
		
		//list.forEach((t)->System.out.println(t)); // here t is obvious that (t ) will be passed and it will println
		
		//list.forEach(new Consumer<Integer>();
	}

}
