package nestediff;

import java.util.Scanner;

public class Class_grade
{
	public static void main(String[] kk)
	{
		Scanner x=new Scanner(System.in);
		int e,m,t,h,s,total,avg;
		System.out.println("enter e,m,t,h,s marks");
		e=x.nextInt();
		m=x.nextInt();
		t=x.nextInt();
		h=x.nextInt();
		s=x.nextInt();
		total=e+m+t+h+s;
		avg=total/5;
		if(e>=35 && m>=35 && t>=35 && h>=35 && s>=35)
		{
			if(avg>=75 && avg<=100)
			{
				System.out.println("student is first class");
			}
			else 
			{
				System.out.println("student is third class");
			}
		}
       else
	   {
	   System.out.println("student is fail");
		
	   }
		
		
	}

}
