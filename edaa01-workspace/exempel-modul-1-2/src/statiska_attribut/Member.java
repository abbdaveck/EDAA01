package statiska_attribut;
public class Member {
	private static int number = 0;

	public Member() {
		number++;
	}

	public static int getNumberMembers() {
		return number;
	}

	public static void main(String[] args) {
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		System.out.println("Antal medlemmar: " + Member.getNumberMembers());

	}
}