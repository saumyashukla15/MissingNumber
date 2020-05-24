import java.util.*;
import java.io.*;
import java.lang.*;
class Missingnumber{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
			int sum=0,total=0,missing=0;
			int n=sc.nextInt();
			int []ar=new int[n-1];
			for(int i=0;i<n-1;i++)
			{
				ar[i]=sc.nextInt();
				sum+=ar[i];
			}
			//calculating total of 1 to n
			total=(n*(n-1))/2;
			missing=total-sum;
			System.out.println(missing);
			t--;
			
		}
	}
}