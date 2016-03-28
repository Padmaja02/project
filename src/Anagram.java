import java.util.Arrays;
import java.util.Scanner;


public class Anagram {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String str=sc.next();
		String[] str1=str.split("-");
		char[] ch1=str1[0].toCharArray();
		char[] ch2=str1[1].toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean ang=false;
		System.out.println(ch1);
		System.out.println(ch2);
		if(ch1.length==ch2.length)
		{
			for(int i=0;i<ch1.length;i++)
			{
				if(ch1[i]==ch2[i])
					ang=true;
				else
				{
					ang=false;
					break;
				}
			}
		}
		if(ang)
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");
	}
}
