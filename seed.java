import java.io.*;
import java.util.*;
class seed
{
public static void main(String args[])
{
int x;
Scanner in=new Scanner(System.in);
int sed=in.nextInt();
int temp=sed;
	while(sed>0)
	{
		x=sed%10;
		if(x==0)
		x=++x;
		temp=temp*x;
		sed=sed/10;
		System.out.println("sed value is.."+sed+"\t"+"x value is..."+x+"\t");
	}
System.out.println(temp);

}
}