package generics;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.Utilities;

public class genericMethods {
	public static <T> void fill(List<T> list, T val) {
		for (int i=0; i<list.size();i++)
			list.set(i, val);
	}

}

class UtilitiesTest{
	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(20);
		System.out.println("original list is" +intList);
		genericMethods.fill(intList,100);
		System.out.println("list after" + intList);		
	}
}