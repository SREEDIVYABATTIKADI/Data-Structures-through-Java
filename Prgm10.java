import java.util.*;
class Prgm10
{
static void mergesort(String a[],int lb,int mid,int ub)
{
String b[]=new String[a.length];
int i=lb,k=lb,j=mid+1;
while(i<=mid&&j<=ub)
{
if(a[i].compareTo(a[j])<0)
{
b[k]=a[i];
i++;
k++;
}
else
{
b[k]=a[j];
k++;
j++;
}
}
while(i<=mid)
{
b[k]=a[i];
k++;
i++;
}
while(j<=ub)
{
b[k]=a[j];
k++;
j++;
}
for(i=lb;i<=ub;i++)
a[i]=b[i];
}
static void msort(String a[],int lb,int ub)
{
if(lb<ub)
{
int mid=(lb+ub)/2;
msort(a,lb,mid);
msort(a,mid+1,ub);
mergesort(a,lb,mid,ub);
}
}
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
System.out.println("enter n value");
n=s.nextInt();
String a[]=new String[n];
System.out.println("enter elements");
for(int i=0;i<n;i++)
a[i]=s.next();
msort(a,0,n-1);
System.out.println("sorted list");
for(int i=0;i<n;i++)
System.out.println(a[i]);
}
}