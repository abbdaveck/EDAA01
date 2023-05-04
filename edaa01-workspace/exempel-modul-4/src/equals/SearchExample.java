package equals;
import java.util.ArrayList;
import java.util.List;

public class SearchExample {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("Fili", 1));
		list.add(new Person("Balin", 2));
		list.add(new Person("Dori", 4));
		list.add(new Person("Kili", 3));
		boolean isThere = list.contains(new Person("Balin", 2));
		System.out.println(isThere);
	}
}
