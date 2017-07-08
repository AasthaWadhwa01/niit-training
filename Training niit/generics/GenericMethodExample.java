package generics;

public class GenericMethodExample {
	public static void main(String[] args) {
		
	
	GenericMethod<StringCompareCAR, Person> gm= new GenericMethod<StringCompareCAR, Person>();
	gm.assignCar(new StringCompareCAR("Model","brand","color"), new Person("Aastha", 22, 43));
	}
}
