import java.util.*;
public class Prgm11
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
public static void bsort(int a[])
{
for(int pass=0;pass<a.length-1;pass++)
{
for(int i=0;i<a.length-1;i++)
if(a[i]>a[i+1])
{
int t=a[i];
a[i]=a[i+1];
a[i+1]=t;
}
}
}
public static void main(String args[])
{
int n,key;
Scanner s=new Scanner(System.in);
System.out.println("ENTER SIZE");
n=s.nextInt();
int a[]=new int[n];
System.out.println("ENTER ELEMENTS");
for(int i=0;i<n;i++)
a[i]=s.nextInt();
bsort(a);
System.out.println("SORTED LIST USING BUBBLE SORT");
for(int i=0;i<n;i++)
System.out.println(a[i]);
System.out.println("ENTER KEY ELEMENT");
key=s.nextInt();
int loc=rbsearch(a,0,n-1,key);
if(loc==-1)
System.out.println("KEY ELEMENT NOT FOUND");
else
System.out.println("KEY ELEMENT IS "+key+" FOUND AT LOCATION:"+loc); 
}
}