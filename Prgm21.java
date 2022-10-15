import java.util.*;
public class Prgm21
{
public static int rbsearch(String a[],int lb,int ub,String key)
{
if(lb<=ub)
{
int mid=(lb+ub)/2;
int value=key.compareTo(a[mid]);
if(value==0)
return mid;
else if(value<0)
return rbsearch(a,lb,mid-1,key);
else
return rbsearch(a,mid+1,ub,key);
}
return -1;
}
public static void ssort(String a[])
{
for(int i=0;i<a.length-1;i++)
{
int mi=i;
String  me=a[i];
for(int j=i+1;j<a.length;j++)
{
if(a[j].compareTo(me)<0)
{
me=a[j];
mi=j;
}
}
if(mi!=i)
{
String t=a[mi];
a[mi]=a[i];
a[i]=t;
}
}
}
public static void main(String args[])
{
int n;
String key;
System.out.println("Enter n value");
Scanner s=new Scanner(System.in);
n=s.nextInt();
String a[]=new String[n];
System.out.println("enter elements");
for(int i=0;i<n;i++)
a[i]=s.next();
ssort(a);
System.out.println("sorted list using selection sort");
for(int i=0;i<n;i++)
System.out.println(a[i]);
System.out.println("enter key");
key=s.next();
int loc=rbsearch(a,0,n-1,key);
if(loc==-1)
System.out.println(" key element not found");
else
System.out.println("key element "+key+" found at location:"+loc);
}
}