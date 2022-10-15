import java.util.*;
public class Prgm2
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
public static void insort(int a[])
{
for(int i=1;i<a.length;i++)
{
int t=a[i], j=i-1;
while(j>=0&&t<a[j])
{
a[j+1]=a[j];
j--;
}
a[j+1]=t;
}
}
public static void main(String args[])
{
int n,key;
System.out.println("ENTER SIZE");
Scanner s=new Scanner(System.in);
n=s.nextInt();
int a[]=new int[n];
System.out.println("ENTER ELEMENTS");
for(int i=0;i<n;i++)
a[i]=s.nextInt();
insort(a);
System.out.println("THE SORTED LIST USING INSERTION SORT");
for(int i=0;i<n;i++)
System.out.println(a[i]);
System.out.println("ENTER KEY ELEMENT");
key=s.nextInt();
int loc=bsearch(a,0,a.length-1,key);
if(loc==-1)
System.out.println("KEY ELEMENT IS NOT FOUND");
else
System.out.println("KEY ELEMENT "+key+" IS FOUND AT THE LOCATION:"+loc);
}
}

