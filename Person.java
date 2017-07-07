
public class Person {
String name;
int age;
int rollno;


public Person(String name, int age, int rollno) {
	super();
	this.name = name;
	this.age = age;
	this.rollno = rollno;
}

public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
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

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Person [name=" + name +",age=" + age + "]";
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
