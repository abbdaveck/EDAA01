package java_intro;
public class TwoSquares {
	public static void main(String[] args) {
		Square sq1 = new Square(50, 50, 100);
		Square sq2 = new Square(100, 200, 20);
		sq1 = sq2;
		sq1.setSide(30);
		System.out.println(sq2.getSide());
		
		System.out.println(sq1.area());
		System.out.println(sq2.area());
	}
}
