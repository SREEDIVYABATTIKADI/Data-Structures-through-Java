import java.util.*;
class Prgm25
{
static int lsearch(int a[],int lb,int ub,int key)
{
for(int i=0;i<=a.length;i++)
{
if(key==a[i])
return i;
}
return -1;
}
static int lrsearch(int a[],int lb,int ub,int key)
{
int i=lb;
if(lb<ub)
{
if(key==a[i])
return i;
else 
return lrsearch(a,lb+1,ub,key);
}
return -1;
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
System.out.println("enter key");
int key=s.nextInt();
int loc=lsearch(a,0,n-1,key);
if(loc==-1)
System.out.println("element not found");
else
System.out.println("element found at "+loc);
System.out.println("using recursive linear search");
int pos=lrsearch(a,0,n-1,key);
if(pos==-1)
System.out.println("element not found");
else
System.out.println("element found at "+pos);
}
}

