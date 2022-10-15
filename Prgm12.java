import java.util.*;
public class Prgm12
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
public static void insort(int a[])
{
for(int i=1;i<a.length-1;i++)
{
int t=a[i],j=i-1;
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
Scanner s=new Scanner(System.in);
System.out.println("ENTER SIZE");
n=s.nextInt();
int a[]=new int[n];
System.out.println("ENTER ELEMENTS");
for(int i=0;i<n;i++)
a[i]=s.nextInt();
insort(a);
System.out.println("SORTED LIST USING INSERTION SORT");
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

