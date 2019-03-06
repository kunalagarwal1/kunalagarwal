import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int sum=0;
		Scanner sc=new Scanner(System.in);
 
int n=sc.nextInt();
 
int K=sc.nextInt();
 
int arr[]=new int[n];
 
for(int i=0;i<n;i++)
 
{
 
arr[i]=sc.nextInt(); 
 
}
for(int j=0;j<n;j++)
{
	sum=sum+arr[j];
}
System.out.println(sum);
	}
}
