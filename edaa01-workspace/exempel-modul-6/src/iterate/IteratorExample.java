package iterate;

import java.util.ArrayList;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(41);
		list.add(-20);
		list.add(-2);
		list.add(11);
			
		// for-each - summera talen
		int sum = 0;
		for (int n : list) {
				sum += n;
		}
		System.out.println(sum);
	}

}
