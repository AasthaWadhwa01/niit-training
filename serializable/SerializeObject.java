package serializable;

import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeObject {
	public static void main(String[] args) {
	StringCompareCAR car= new StringCompareCAR("A6", "audi", "pink");
	
	ObjectOutputStream oo= null;
	ObjectInputStream oi= null;
	
	try{
		oo= new ObjectOutputStream(new ObjectOutputStream(new File("D:/ mycar")));
		oo.writeObject(mycar);
		System.out.println("pe");
		
	}
}
}
