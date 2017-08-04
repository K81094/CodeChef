package beginner;

/*
 * Problem Name : Small Factorials
 * Problem Id : FCTRL2
 * Attempt required : 2
 * Url : https://www.codechef.com/problems/FCTRL2
 * Date : 05 08 2017 01:05
 *
 */

import java.math.BigInteger;
import java.util.Scanner;

public class SmallFactorials_FCTRL2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		BigInteger[] temp=new BigInteger[101];
		while(t--!=0){
			int n=sc.nextInt();
			BigInteger b=BigInteger.valueOf(1);
			for(int i=n;i!=1;i--){
				if(temp[i]==null){
					b=b.multiply(BigInteger.valueOf(i));
				}else{
					b=b.multiply(temp[i]);
					break;
				}
				
			}
			temp[n]=b;
			System.out.println(b);
		}
		

	}

}
