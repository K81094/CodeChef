package beginner;

import java.util.Scanner;

public class EnormousInputTest_INTEST {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long k=sc.nextLong();
		long count=0;
		for(long i=0;i<n;i++){
			long t=sc.nextLong();
			if(t%k==0)
				count++;
		}
		System.out.println(count);

	}

}
