import java.util.HashSet;
import java.util.Scanner;

public class Count {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = new String[10];
		sc = new Scanner(System.in);
		HashSet<String> set = new HashSet<String>();
		HashSet<String> set1 = new HashSet<String>();
        for (String arrayElement : strArray)
        {
            if(!set.add(arrayElement))
            {
                set1.add(arrayElement);
            }
        }
        System.out.println(set1.size());

	}

}
