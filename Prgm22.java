import java.util.*;
public class Prgm22
{
public static int rbinary(String a[],int lb,int ub,String key)
{
if(lb<=ub)
{
int mid=lb+ub/2;
int value=key.compareTo(a[mid]);
if(value==0)
return mid;
else if(value<0)
return ub=mid-1;
else
return lb=mid+1;
}
return -1;
}
public static void insort(String a[])
{
for(int i=1;i<a.length;i++)
{
String t=a[i];
int j=i-1;
while((j>=0)&&(a[j].compareTo(t)>0))
{
a[j+1]=a[j];
j--;
}
a[j+1]=t;
}
}
public static void main(String args[])
{
int n;
System.out.println("ENTER SIZE");
Scanner s=new Scanner(System.in);
n=s.nextInt();
String a[]=new String[n];
System.out.println("ENTER NAMES");
for(int i=0;i<n;i++)
a[i]=s.next();
insort(a);
System.out.println("LIST AFTER SORTING USING INSERTION SORT");
for(int i=0;i<n;i++)
System.out.println(a[i]);
String key;
System.out.println("ENTER KEY");
key=s.next();
int loc=rbinary(a,0,n-1,key);
if(loc==-1)
System.out.println("NAME NOT FOUND");
else
System.out.println(key+"FOUND AT LOCATION:"+loc);
}
}


