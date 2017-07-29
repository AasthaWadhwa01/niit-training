package junit;

public class MyClass {

	public MyClass() {
		
	}

	private Util util;

	public Util getUtil() {
		return util;
	}

	public void setUtil(Util util) {
		this.util = util;
	}
	
	public String toPrint(int a) {
		return "The string value of integer " + a + " is "+ util.convert(a);
	}
	
	public static void main(String arg[]) {
		MyClass cl = new MyClass();
		cl.setUtil(new Util());
		System.out.println(cl.toPrint(2534));
	}
}
