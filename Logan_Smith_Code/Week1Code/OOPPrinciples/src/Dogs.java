
public class Dogs implements DogNeeds {

	public static int dognumber;
	
	int age;
	String name;
	String color;
	String size;
	int ID;
	
	
	public Dogs (int age, String name, String color, String size) {
	this.age = age;
	this.name = name;
	this.color = color;
	this.size = size;
	
	dognumber++;
	
	this.ID = dognumber;
	}
	
	public Dogs (int age) {
		this(age, "Unknown", "Unknown", "Unknown");
	}
	
	public Dogs (String name) {
		this(0, name, "Unknown", "Unknown");
	}
	
	public void prance() {
		System.out.println(name + " prances about! What a beautiful " + age + " year old dog! Yes, I do love its " + this.color +
			". We really don't see enough " + size + " dogs out here!");
	}
	
	public void bites() {
		System.out.println("My dog would never bite me, but dogs do need to be able to bite to survive.");
	}
	
	public String getName() {
		return name;
	}
	
	public int getID() {
		return ID;
	}
	
}
