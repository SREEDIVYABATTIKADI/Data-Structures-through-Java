import java.util.*;
public class Mergesort
{
public static void msort(int a[],int lb,int ub)
{
if(lb<ub)
{
int mid=(lb+ub)/2;
msort(a,lb,mid);
msort(a,mid+1,ub);
merge(a,lb,mid,ub);
}
}
public static void merge(int a[],int lb,int mid,int ub)
{
int b[]=new int[a.length];
int i=lb,j=mid+1,k=lb;
while(i<=mid&&j<=ub)
{
if(a[i]<a[j])
{
b[k]=a[i];
i++;
k++;
}
else
{
b[k]=a[j];
j++;
k++;
}
}
while(i<=mid)
{
b[k]=a[i];
i++;
k++;
}
while(j<=ub)
{
b[k]=a[j];
j++;
k++;
}
for(i=lb;i<=ub;i++)
a[i]=b[i];
}
public static void main(String args[])
{
int n;
System.out.println("enter n value");
Scanner s=new Scanner(System.in);
n=s.nextInt();
int a[]=new int[n];
System.out.println("enter elements");
for(int i=0;i<n;i++)
a[i]=s.nextInt();
System.out.println("sorted list");
msort(a,0,a.length-1);
for(int i=0;i<n;i++)
System.out.println(a[i]);
}
}
