import java.util.Scanner;


public class FantabArray {

	private static Scanner sc;
	private static int prod;
	private static int sum;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		boolean fab=true;
		boolean fant=true;
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		sum = arr[0];
		prod = arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]>sum)
				sum+=arr[i];
			else
				fab=false;
			if(arr[i]>prod)
				prod*=arr[i];
			else
				fant=false;
		}
		if(fab && fant)
			System.out.println("Fantabulous Array");
		else if(fab)
			System.out.println("Fabulous Array");
		else if(fant)
			System.out.println("Fantastic Array");
		else
			System.out.println("Not an Array");
	}

}
