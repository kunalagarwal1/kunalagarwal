import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int sum=1,c=0;
		Scanner sc=new Scanner(System.in);
 
int n=sc.nextInt();
int p=sc.nextInt();
for(int i=0;i<p;i++)
{
	sum=sum*n;
}
System.out.println(sum);
	}
}
