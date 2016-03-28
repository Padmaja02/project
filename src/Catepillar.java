import java.util.ArrayList;
//import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class Catepillar {
	private static Scanner sc;

	public static void main(String[] args)
	{
		sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int len;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<k;i++)
			arr.add(sc.nextInt());
		for(Integer a: arr)
		{
			for(int i=1;i<=n;i++)
			{
				if(i%a==0)
					set.add(i);
			}
		}
		len=n-set.size();
		System.out.println(len);
	}

}
