import java.util.*;
public class Prgm14
{
public static int rbsearch(int a[],int lb,int ub,int key)
{
if(lb<=ub)
{
int mid=(lb+ub)/2;
if(key==a[mid])
return mid;
else if(key<a[mid])
return rbsearch(a,lb,mid-1,key);
else
return rbsearch(a,mid+1,ub,key);
}
return -1;
}
public static void ssort(int a[])
{
for(int i=0;i<a.length-1;i++)
{
int mi=i;
int me=a[i];
for(int j=i+1;j<a.length;j++)
{
if(a[j]<me)
{
me=a[j];
mi=j;
}
}
if(mi!=i)
{
int t=a[mi];
a[mi]=a[i];
a[i]=t;
}
}
}
public static void main(String args[])
{
int n,key;
System.out.println("Enter n value");
Scanner s=new Scanner(System.in);
n=s.nextInt();
int a[]=new int[n];
System.out.println("enter elements");
for(int i=0;i<n;i++)
a[i]=s.nextInt();
ssort(a);
System.out.println("sorted list using selection sort");
for(int i=0;i<n;i++)
System.out.println(a[i]);
System.out.println("enter key");
key=s.nextInt();
int loc=rbsearch(a,0,n-1,key);
if(loc==-1)
System.out.println(" key element not found");
else
System.out.println("key element "+key+" found at location:"+loc);
}
}

