import java.util.*;
class Prgm23
{
static int partition(String a[],int lb,int ub)
{
int i=lb;
int j=ub;
String pivot=a[lb];
while(i<j)
{
while(i<j&&a[i].compareTo(pivot)<=0)
{
i++;
}
while(j>lb&&a[j].compareTo(pivot)>0)
{
j--;
}
if(i<j)
{
String t=a[i];
a[i]=a[j];
a[j]=t;
}
}
a[lb]=a[j];
a[j]=pivot;
return j;
}
static void qsort(String a[],int lb,int ub)
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
String a[]=new String[n];
System.out.println("enter names");
for(int i=0;i<n;i++)
a[i]=s.next();
qsort(a,0,n-1);
System.out.println("elements after sorting are:");
for(int i=0;i<n;i++)
System.out.print(a[i]+" ");
}
}