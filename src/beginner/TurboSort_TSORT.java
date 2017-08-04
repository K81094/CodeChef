package beginner;

import java.util.Arrays;

/*
 * Problem Name : Turbo Sort
 * Problem Id : TSORT
 * Attempt required : 2
 * Url : https://www.codechef.com/problems/TSORT
 * Date : 05 08 2017 01:35
 *
 */

import java.util.Scanner;

public class TurboSort_TSORT {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int[] a=new int[t];
		int i=0;
		for(i=0;i<t;i++)
			a[i]=sc.nextInt();
		Arrays.sort(a);
		for(i=0;i<t;i++)
			System.out.println(a[i]);
	}

}
