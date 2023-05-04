package interface_measurable;

public class Square implements Measurable {
	private int side;

	public Square(int side) {
		this.side = side;
	}

	public int getSide(){
		return side;
	}

	@Override
	public double area() {
		return side * side;
	}
}


