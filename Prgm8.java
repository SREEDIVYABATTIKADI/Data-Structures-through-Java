import java.util.*;
class Prgm8
{
static int partition(int a[],int lb,int ub)
{
int i=lb;
int j=ub;
int pivot=a[lb];
while(i<j)
{
while(i<j&&a[i]<=pivot)
{
i++;
}
while(j>lb&&a[j]>pivot)
{
j--;
}
if(i<j)
{
int t=a[i];
a[i]=a[j];
a[j]=t;
}
}
a[lb]=a[j];
a[j]=pivot;
return j;
}
static void qsort(int a[],int lb,int ub)
{
if(lb<ub)
{
int pos=partition(a,lb,ub);
qsort(a,lb,pos-1);
qsort(a,pos+1,ub);
}
}
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("enter size");
n=s.nextInt();
int a[]=new int[n];
System.out.println("enter elements");
for(int i=0;i<n;i++)
a[i]=s.nextInt();
qsort(a,0,n-1);
System.out.println("elements after sorting are:");
for(int i=0;i<n;i++)
System.out.print(a[i]+" ");
}
}