package jdbc;

public class Person {
String name;
int age;
Gender gender;







public Person(String name, int age, Gender gender) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
}







public String getName() {
	return name;
}







public void setName(String name) {
	this.name = name;
}







public int getAge() {
	return age;
}







public void setAge(int age) {
	this.age = age;
}







public Gender getGender() {
	return gender;
}







public void setGender(Gender gender) {
	this.gender = gender;
}







@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
}







@Override
public boolean equals(Object obj) {
	// TODO Auto-generated method stub
	if(this== obj)
		return true;
	if(obj== null)
		return false;
	if(getClass() != obj.getClass())
		return false;
	Person other= (Person) obj;
	if(age != other.age)
		return false;
	
	if(name ==null) {
		if(other.name != null)
			return false;
	}
	
	else if (!name.equals(other.name))
		return false;
	return true;
}
}
