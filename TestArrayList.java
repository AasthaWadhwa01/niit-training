import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayList<StringCompareCAR> araylist= new ArrayList<StringCompareCAR>();
		StringCompareCAR c= new StringCompareCAR("A4","FORTUNER","Black",);
		araylist.add(new StringCompareCAR("s8","Range Rover","Blue",));
		araylist.add(new StringCompareCAR("A6","Audi","Black"));
		araylist.add(2,new StringCompareCAR("r1","xuv","silver"));
		araylist.add(c);
		araylist.add(c);
		
		
		/*LinkedList<StringCompareCAR> linkedlist= new LinkedList<StringCompareCAR>();
		StringCompareCAR c= new StringCompareCAR("A4","FORTUNER","Black");
		linkedlist.add(new StringCompareCAR("s8","Range Rover","Blue"));
		linkedlist.add(new StringCompareCAR("A6","Audi","Black"));
		linkedlist.add(2,new StringCompareCAR("r1","xuv","silver"));
		linkedlist.add(c);
		linkedlist.add(c);
		
		/*Collections.sort(araylist, new Comparator<StringCompareCAR>() {

			@Override
			public int compare(StringCompareCAR o1, StringCompareCAR o2) {
				// TODO Auto-generated method stub
				return o1.getColor().compareTo(o2.getColor());
			}
		}); */
		
		Set<StringCompareCAR> araylist= new HashSet<StringCompareCAR>();
		StringCompareCAR c= new StringCompareCAR("A4","FORTUNER","Black");
		araylist.add(new StringCompareCAR("s8","Range Rover","Blue"));
		araylist.add(new StringCompareCAR("A6","Audi","Black"));
		araylist.add(2,new StringCompareCAR("r1","xuv","silver"));
		araylist.add(c);
		araylist.add(c);
		
		
		
		
		for(StringCompareCAR c1:linkedlist){
		System.out.println("model"+ c1.getModel()+"color"
		+ c1.getColor()+"brand"+ c1.getBrand());
		}
		System.out.println(linkedlist);
		
	}

}
