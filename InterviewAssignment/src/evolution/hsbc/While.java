package evolution.hsbc;

public class While {
	public static void main(String[] args) {
		int x = 1, y = 6;
		while (y--) {
			x++;
		}
		System.out.println("x = " + x + " y = " + y);
	}
}
