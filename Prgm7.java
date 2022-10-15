import java.util.*;
class Prgm7
{
int f=-1,r=-1,a[];
Prgm7(int n)
{
a=new int[n];
}
boolean isEmpty()
{
if(f==-1&&r==-1)
return true;
else
return false;
}
boolean isFull()
{
if(r==a.length-1)
return true;
else
return false;
}
void enqueue(Scanner s)
{
if(isFull())
System.out.println("queue is full");
else 
{
int ele;
System.out.print("enter element:");
ele=s.nextInt();
if(isEmpty())
{
f=0;
r=r+1;
a[r]=ele;
System.out.println("first element is inserted");
}
else
{
r=r+1;
a[r]=ele;
System.out.println("element inserted");
}
}
}
void dequeue()
{
if(isEmpty())
System.out.println("queue is empty");
else if(f==r)
{
System.out.println(a[f]+" is deleted");
f=-1;
r=-1;
}
else
{
int d=a[f];
f=f+1;
System.out.println(d+" is deleted");
}
}
void display()
{
if(isEmpty())
System.out.println("queue is empty");
else
{
System.out.println("The elements are:");
for(int i=f;i<=r;i++)
System.out.print(a[i]+" ");
}
}
void display_rev()
{
if(isEmpty())
System.out.println("queue is empty");
else
{
System.out.println("The elements are:");
for(int i=r;i>=f;i--)
System.out.print(a[i]+" ");
}
}
public static void main(String args[])
{
int n,m;
Scanner s=new Scanner(System.in);
System.out.println("Enter size");
n=s.nextInt();
Prgm7 q=new Prgm7(n);
do
{
System.out.print("ENTER 1 TO ENQUEUE,2 TO DEQUEUE,3 TO DISPLAY,4 TO DISPLAY DISPLAY IN REVERSE ORDER:");
m=s.nextInt();
switch(m)
{
case 1: q.enqueue(s);
	break;
case 2: q.dequeue();
	break;
case 3: q.display();
	break;
case 4: q.display_rev();
	break;
default:System.out.println("INVALID SELECTION");
	break;
}
System.out.print("enter 1 to continue:");
m=s.nextInt();
}
while(m==1);
}
}



