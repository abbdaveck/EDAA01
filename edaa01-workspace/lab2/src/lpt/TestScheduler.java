package lpt;

// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Map;
import java.util.*;

public class TestScheduler {

	public static void main(String[] args) {

		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("albatross", 12);
		m.put("pelikan", 27);
		m.put("lunnefågel", 19);
		m.put("albatross", 7);
		System.out.println(m.get("albatross"));
		// int i = m.get("albatross") + m.put();

		// Machine[] m = new Machine[3];
		// for (int i = 0; i < m.length; i++) {
		// m[i] = new Machine(i + 1);
		// }

		// ArrayList<Job> jobList = new ArrayList<Job>();
		// String [] names = {"j1", "j2", "j3", "j4", "j5", "j6", "j7"};
		// int[] times = {2, 14, 4, 16, 6, 5, 3};
		// for (int i = 0; i < names.length; i++) {
		// jobList.add(new Job(names[i], times[i]));
		// }

		// Scheduler s = new Scheduler(m);
		// s.makeSchedule(jobList);
		// s.printSchedule();
	}

}

// Fel 1:
// Rad 12 i metoden Scheduler i Scheduler.java.
// Istället för att sätta värdet den offentiliga variablen machines skapdes
// istället en lokal variabel som inte kunde nås i resten av koden

// Fel 2:
// Rad 48 i printSchedule i Scheduler.java.
// Antal objekt i listan är 3 men objektet med högsta indexeringen är 2 då man
// börjar räkna från 0 så då blir de fel om man söker efter machines[3]

//Fråga på punk 3:
//Prioritetskö

// Fråga på punkt 4:
// Komparatorn jämförde första objektet med andra istället för andra med första
// och då blev listan i storleksordning och inte tvärt om.

// Fråga på punk 5:
// De skulle vara += istället för = på rad 20 i Machine.java

// F4
// a) Svar: 20 rader, JA
// b) Svar 10 rader, NEJ
// c) Svar: 7
// d) Svar: map.containsKey("---");