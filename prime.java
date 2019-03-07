import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
Scanner sc=new Scanner(System.in);
int c=0;
 
 
int n=sc.nextInt();
for(int i=0;i<=n;i++)
{
	if(n%i==0)
	c=c+1;
}
if(c==2)
{
	System.out.println("yes");
}
else
{
	System.out.println("no");
}
	}
}
