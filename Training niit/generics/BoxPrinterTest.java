package generics;

import javax.swing.text.StringContent;

public class BoxPrinterTest {
	public static void main(String[] args) {
		// BoxPrinter<Integer> value1 = new BoxPrinter<Integer>(new
		// Integer(10));
		// System.out.println(value1);

		BoxPrinter<String> value2 = new BoxPrinter<String>("hello");
		System.out.println(value2);

		BoxPrinter<StringCompareCAR> value3 = new BoxPrinter<StringCompareCAR>(
				new StringCompareCAR("hello", "Red", "Benz"));
		System.out.println(value3);
		
		DiamondCase<T, U>
		
		DiamondCase<Person, StringCompareCAR-+> value4 = new DiamondCase<Integer, Integer>(new 
				
	}
}
