package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExamples {
	public static void main(String[] args) {
		// Från lista till ström
		// Skriv ut (i versaler) de ord som berstår av mer än fyra tecken
		List<String> words = Arrays.asList("Här är en sträng med några ord".split(" "));		
		words.stream()
			.filter(s -> s.length() > 4)
			.map(s -> s.toUpperCase())
			.forEach(s -> System.out.println(s)); 
		
		// Från vektor till ström till mängd
		String[] a = {"a", "few", "words"};
		Set<Integer> set = Stream.of(a)
				.map(s -> s.length())
				.collect(Collectors.toSet());
		System.out.println(set);
		
		
		// Generera och skriv ut 5 slumptal
		Stream.generate(() -> Math.random())
			.limit(5)
			.forEach(r -> System.out.println(r));
		// Samma sak, men med metodreferenser
		Stream.generate(Math::random).limit(5).forEach(System.out::println);
		
		
		// Summera några tal
		int sum = IntStream.of(31, -11, 22).reduce(0, (x, y) -> x + y);
		System.out.println(sum);		
	}	
}