import java.util.HashMap;
import java.util.Map;

public class DemoMaps{
	public static void main(String[] args) {
		HashMap<Person,StringCompareCAR> mymap=new HashMap<Person, StringCompareCAR>();
		Person p= new Person("Amit",30,1);
		StringCompareCAR c=new StringCompareCAR("A2","Red","Audi");
		
		mymap.put(new Person("Aastha",22,1), new StringCompareCAR("A2","Orange","benz"));
		mymap.put(new Person("abhi",21,2), new StringCompareCAR("xuv","blue","maruti"));
		mymap.put(new Person("Ajay",22,3), new StringCompareCAR("t5","white","scoda"));
		mymap.put(new Person("Anjali",22,4), new StringCompareCAR("A6","silver","audi"));
		mymap.put(null, new StringCompareCAR("A2","Orange","benz"));
		mymap.put(p,c);
		mymap.put(p,c);

for(Map.Entry<Person, StringCompareCAR> car1 : mymap.entrySet()){
	System.out.println("key :" + car1.getKey()+ "value" + car1.getValue());
}
System.out.println("value for1,Amit is" +mymap.get(p));
	}

}
