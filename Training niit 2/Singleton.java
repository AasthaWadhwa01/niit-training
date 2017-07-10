
public class Singleton {
public static Singleton ins;
public synchronized static Singleton getInstance(){
	if (ins == null){
		ins = new Singleton();
	}
	return ins;
}
	private Singleton(){
		
	}
}

