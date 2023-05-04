package compare;
public class Person implements Comparable<Person> {
	private String name;
	private int id;
	
	public Person (String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			return id == ((Person) obj).id;
		} else {
			return false;
		}
	}
	
	@Override
	public int compareTo(Person obj) {
		return Integer.compare(id, obj.id);
	}	
	
	@Override
	public String toString() {
		return name + " " + id;
	}
}
