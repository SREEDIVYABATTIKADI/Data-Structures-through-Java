import java.util.*;
public class Prgm1
{
public static int bsearch(int a[],int lb,int ub,int key)
{
while(lb<=ub)
{
int mid=(lb+ub)/2;
if(key==a[mid])
return mid;
else if(key<a[mid])
ub=mid-1;
else
lb=mid+1;
}
return -1;
}
public static void bsort(int a[])
{
for(int pass=0;pass<a.length-1;pass++)
{
for(int i=0;i<a.length-1;i++)
{
if(a[i]>a[i+1])
{
int t=a[i];
a[i]=a[i+1];
a[i+1]=t;
}
}
}
}
public static void main(String args[])
{
int n,key;
System.out.println("enter n value");
Scanner s=new Scanner(System.in);
n=s.nextInt();
int a[]=new int[n];
System.out.println("Enter elements");
for(int i=0;i<n;i++)
a[i]=s.nextInt();
bsort(a);
System.out.println("sorted list using bubblesort");
for(int i=0;i<n;i++)
System.out.println(a[i]);
System.out.println("Enter key");
key=s.nextInt();
int loc=bsearch(a,0,a.length-1,key);
if(loc==-1)
System.out.println("search is unsuccessful");
else
System.out.println("search is successful key element "+key+" is found at location:" +loc);
}
}
