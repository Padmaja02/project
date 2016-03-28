import java.util.Arrays;
import java.util.Scanner;


public class MergeSort {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int[] a1=new int[n1];
		for(int i=0;i<n1;i++)
			a1[i]=sc.nextInt();
		int n2=sc.nextInt();
		int[] a2=new int[n2];
		int l=n1+n2;
		int[] a3=new int[l];
		for(int i=0;i<n2;i++)
			a2[i]=sc.nextInt();
		//System.out.println("end of ip");
		for(int i=0;i<n1;i++)
		{
			a3[i]=a1[i];
			//System.out.println(a3[i]);
		}
		int j=0;
		for(int i=n1;i<l;i++)
			a3[i]=a2[j++];
		Arrays.sort(a3);
		for(int a:a3)
			System.out.print(a+" ");
	}

}
