package iterate;

import java.util.ArrayList;
import java.util.List;

public class RemoveIfExamples {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(41);
		list.add(-20);
		list.add(-2);
		list.add(11);
		System.out.println(list);

		// Ta bort alla negativa tal
		list.removeIf(n ->  n < 0);
		System.out.println(list);

		// Ta bort alla udda tal
		list.removeIf(n -> n % 2 != 0);
		System.out.println(list);
	}
}
