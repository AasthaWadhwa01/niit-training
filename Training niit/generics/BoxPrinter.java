package generics;

public class BoxPrinter<T> {
	private T val;
	public BoxPrinter(T arg) {
		val = arg;
	}
	@Override
	public String toString() {
		return "[" + val + "]";
	}
	
	
}
