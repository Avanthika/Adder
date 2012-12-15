import java.io.*;
public class add
{
public static void main(String[] args)throws IOException
{
DataInputStream dis=new DataInputStream(System.in);
int a,b;
System.out.println("Enter the 1st No: ");
a=Integer.parseInt(dis.readLine());
System.out.println("Enter the 2nd No: ");
b=Integer.parseInt(dis.readLine());
System.out.println("The value is : "+sum(a,b));
}
public static int sum(int a, int b)
{
return a+b;
} 
}
