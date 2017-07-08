import java.util.ArrayDeque;
import java.util.Deque;

public class MyDequeue {
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Ravi");
		deque.add("Vijay");
		
		//Traversing elements
		
	for(String string : deque) {
		System.out.println(string);
	}
	
	//retrive but doesnot remove element
	String value = deque.peek();
	System.out.println(deque);
	System.out.println(value);
	
	//retrieve and remove element
	value = deque.pop();
	System.out.println(deque);
	System.out.println(value);
	
	//remove from head
	value = deque.poll();		//poll means head
	System.out.println(deque);
	System.out.println(value);
	
	//insert at tail
	deque.offer("value");
	System.out.println(deque);
	//insert at start or head
	String value1 = null;
	deque.offerFirst(value1);
	System.out.println(deque);
	
	//insert at tail
	deque.offerLast("value2");
	System.out.println(deque);
	
	
	}

}
