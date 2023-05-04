package binarysearchtree;
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
	public boolean equals(Object other) {
		if (other instanceof Person) {
			return id == ((Person) other).id;
		} else { 
			return false;
		}
	}

	@Override
	public int compareTo(Person other) {
		return Integer.compare(id, other.id);
	}
	
	public String toString() {
		return name + " " + id;
	}	
}
