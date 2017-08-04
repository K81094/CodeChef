package ioniPractice2015;

import java.util.Scanner;

/*
 * Problem Name : Free Ticket
 * Problem Id : INOI1402
 * Attempt required : 0
 * Url : https://www.codechef.com/IOIPRAC/problems/INOI1402
 * Date : 04 08 2017
 *
 */
public class FreeTicket_INOI1402 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int c=sc.nextInt();
		int f=sc.nextInt();
		int[][]a=new int[c+1][c+1];
		int[][]dp=a;
		int result=-1;
		for(int i=1;i<=f;i++){
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=sc.nextInt();
			a[x][y]=z;
			dp[x][y]=z;
		}
		
		//calculate dp
		for(int i=1;i<=c;i++){
			
			
			
			for(int j=1;j<=c;j++){
				//System.out.println(dp[i-1][j]+" "+dp[i-1][j-1]+" "+dp[i][j-1]+" = "+findMinOfThree(dp[i-1][j],dp[i-1][j-1],dp[i][j-1]));
				//System.out.println(dp[i][j] +" "+a[i][j]);
				if(dp[i][j]!=0){
					dp[i][j]=dp[i][j]+findMinOfThree(dp[i-1][j],dp[i-1][j-1],dp[i][j-1]);
					result=dp[i][j];
				}				
			}
		}
		System.out.println(result); //5 test case passout of 20
		//System.out.println(dp[c-1][c]);//2 test case passout of 20
		
		
	}

	public static int findMinOfThree(int x,int y,int z){
		
		if(x!=0 && y!=0 &&  z!=0){
			if (x < y)
	            return (x < z)? x : z;
	        else
	            return (y < z)? y : z;
		}else if(x==0 && y!=0 &&  z!=0){			
	            return (y < z)? y : z;
		}else if(x!=0 && y==0 &&  z!=0){			
            return (x < z)? x : z;
		}else if(x!=0 && y!=0 &&  z==0){			
            return (x < y)? x : y;
		}else if(x!=0 && y==0 &&  z==0){			
            return x;
		}else if(x==0 && y!=0 &&  z==0){			
            return y;
		}else if(x==0 && y==0 &&  z!=0){			
            return z;
		}else {
			if (x < y)
	            return (x < z)? x : z;
	        else
	            return (y < z)? y : z;
		}
		
		
	}
	

}
