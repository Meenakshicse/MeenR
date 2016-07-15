import java.io.*;
import java.lang.*;
import java.util.*;
class Negative
{
public static void main(String args[])
{
int arr[]=new int[10];
Scanner in=new Scanner(System.in);
int n=in.nextInt();
System.out.println("Enter the numbers");
int i;
for(i=0;i<n;i++)
{
arr[i]=in.nextInt();
}
for(i=0;i<n;i++)
if(arr[i]==0)
{
System.out.println("Zero");
}
else if(arr[i]>0)
{
System.out.println("Posi");
}
else
{
System.out.println("Negative");
}
}
}

