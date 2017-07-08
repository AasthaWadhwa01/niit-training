package junit;

public class Generic2<T> {
	private T obj1;
	private T obj2;
	
	public void newClass(T a, T b)
	{
		this.obj1=a;
		this.obj2=b;
	}
	
	public void show(){
		System.out.println(obj1);
		System.out.println(obj2);
	}

}
