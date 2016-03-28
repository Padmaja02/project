import java.util.Scanner;


public class Alphabets {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(str.replaceAll(" ", "").trim().length());
	}
}
