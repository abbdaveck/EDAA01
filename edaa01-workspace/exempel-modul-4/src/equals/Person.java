package equals;
public class Person  {
	private String name;
	private int id;
	
	public Person (String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			return id == ((Person) obj).id;
		} else {
			return false;
		}
	}
	
}
