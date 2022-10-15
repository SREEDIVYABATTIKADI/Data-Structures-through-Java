import java.util.*;
public class Prgm20
{
public static int rbsearch(String a[],int lb,int ub,String key)
{
if(lb<=ub)
{
int mid=(lb+ub)/2;
if(key.compareTo(a[mid])==0)
return mid;
else if(key.compareTo(a[mid])<0)
return rbsearch(a,lb,mid-1,key);
else
return rbsearch(a,mid+1,ub,key);
}
return -1;
}
public static void bsort(String a[])
{
for(int pass=0;pass<a.length-1;pass++)
{
for(int i=0;i<a.length-1;i++)
if(a[i].compareTo(a[i+1])>0)
{
String t=a[i];
a[i]=a[i+1];
a[i+1]=t;
}
}
}
public static void main(String args[])
{
int n;
String key;
Scanner s=new Scanner(System.in);
System.out.println("ENTER SIZE");
n=s.nextInt();
String a[]=new String[n];
System.out.println("ENTER NAMES");
for(int i=0;i<n;i++)
a[i]=s.next();
bsort(a);
System.out.println("SORTED LIST USING BUBBLE SORT");
for(int i=0;i<n;i++)
System.out.println(a[i]);
System.out.println("ENTER KEY");
key=s.next();
int loc=rbsearch(a,0,n-1,key);
if(loc==-1)
System.out.println("KEY IS NOT FOUND");
else
System.out.println(key+" FOUND AT LOCATION:"+loc); 
}
}