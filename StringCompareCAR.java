
public class StringCompareCAR implements Comparable{

	String model;
	String brand;
	String color;

public StringCompareCAR(String model, String brand, String color){
	super();
	this.model=model;
	this.brand=brand;
	this.color=color;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public static void main(String args[]){
	StringCompareCAR obj1=new StringCompareCAR("A4","Benz","Red");
	StringCompareCAR obj2=new StringCompareCAR("A6","Benz","Red");
	System.out.println(obj1.equals(obj2));
	System.out.println(obj1.compareTo(obj2));
	
}

public boolean equals(StringCompareCAR c){
	return this.model.equals(c.model)&&this.brand.equals(c.brand)&&this.color.equals(c.color);
}

@Override
public int compareTo(Object o) {
StringCompareCAR ob=(StringCompareCAR) o;	
	return this.getColor().compareTo(ob.getColor());
}


}
