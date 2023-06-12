package nestediff;

import java.util.Scanner;

public class Biggest_three_integers
{ 
	public void main(String[] kk)
	{
		Scanner x=new Scanner(System.in);
		int a,b,c;
		System.out.println("enter a,b,c values");
		a=x.nextInt();
		b=x.nextInt();
		c=x.nextInt();
		if(a>b||a>c||b>a||b>c||c>a||c>b)
		{
			if( a>b && a>c)
			{
				System.out.println("bigg is"+a);
			}
			else if(b>a && b>c)
			{
				System.out.println("bigg is"+b);
			}
			else if(c>a && c>b)
			{
				System.out.println("bigg is"+c);
			}
		         else
		         {
			     System.out.println("u have entered invalid");
		         }
		}
		else
		{
			System.out.println("all are equals");
		}
	}
	
	
}
