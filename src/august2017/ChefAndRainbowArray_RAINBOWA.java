package august2017;
/*
 * Problem Name : Chef and Rainbow Array
 * Problem Id : RAINBOWA
 * Attempt required : 1
 * Url : https://www.codechef.com/AUG17/problems/RAINBOWA
 * Date : 04 08 2017
 */
import java.util.Scanner;

public class ChefAndRainbowArray_RAINBOWA {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t--!=0){
			int n=sc.nextInt();
			int[] a=new int[n];
			boolean result=true;
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			int[] hm=new int[7];
			for(int i=0;i<(n/2==0?n/2:n/2+1);i++){
				if(a[i]==a[(n-1)-i] && a[i]>0 && a[i]<=7){
					result=true;
					//System.out.println(a[i]);
					hm[a[i]-1]++;
				}else{
					result=false;
					break;
				}
			}
			for(int i=0;i<7;i++){
				//System.out.print(hm[i]+ " ");
				if(hm[i]==0)
					result=false;
			}
			//System.out.println();
				
			if(result)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}

}
