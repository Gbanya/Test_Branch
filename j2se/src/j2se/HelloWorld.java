package j2se;

public class HelloWorld {
	public static void main(String[] args) {
		Season season = Season.Spring;
		switch (season) {
		case Spring:
			System.out.println("����");
			break;
		case Summer:
			System.out.println("����");
			break;
		case Autumn:
			System.out.println("����");
			break;
		case Winter:
			System.out.println("����");
			break;
		}
	}
}
