package iterate;

import java.util.ArrayList;
import java.util.List;

public class ForEachExamples {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(41);
		list.add(-20);
		list.add(-2);
		list.add(11);
		System.out.println(list);

		System.out.println();

		System.out.println("All numbers");
		list.forEach(e -> System.out.println(e));
		System.out.println();

		System.out.println("All negative numbers");
		list.forEach(n -> {
			if (n < 0 ) { 
				System.out.println(n);
			}
		});
		System.out.println();
	}
}
