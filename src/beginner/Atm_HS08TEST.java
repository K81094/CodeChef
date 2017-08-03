package beginner;
/*
 * Codechef - ATM - Atm_HS08TEST
 * URL: https://www.codechef.com/problems/HS08TEST
 * Date : 03 08 2017
 * 
 */
import java.util.Scanner;

public class Atm_HS08TEST {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);	
	    Double x=Double.parseDouble(sc.next());
	    Double y=Double.parseDouble(sc.next());
	    if(x<0 || x>=2000|| y<=0 ||y>2000)
	        System.out.printf("%.2f",y);
	    else if(x+0.50<=y && x.intValue()%5==0)
	        System.out.printf("%.2f",y-x-0.50);
	   else
	       System.out.printf("%.2f",y);
	}
}
