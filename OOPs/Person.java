package OOPs;

public class Person {
	String name = "Anish";
	int age = 21;

	public void Intro_yourself() {
		System.out.println("My Name is " + this.name + " and age is " + this.age);
	}

	public Person() {
		this.name = "Amisha";
		this.age = 22;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge()  {
		 
		return age;
	}

	public void setAge(int age) throws Exception {
		if(age<0) {
			throw new Exception("The age is less than 0");
		}
		this.age = age;
	}

}
