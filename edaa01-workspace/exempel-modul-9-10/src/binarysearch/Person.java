package binarysearch;
public class Person implements Comparable<Person> {
	private String name;
	private int idNbr;
	
	public Person (String name, int idNbr) {
		this.name = name;
		this.idNbr = idNbr;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public int compareTo(Person other) {
		return Integer.compare(idNbr, other.idNbr);
	}
	
	@Override
	public boolean equals(Object x) {
		if (x instanceof Person) {
			return idNbr == ((Person) x).idNbr;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return name + " " + idNbr;
	}

}
