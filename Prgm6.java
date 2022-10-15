import java.util.*;
class Prgm6
{
public class Node
{
int info;
Node next;
Node(int x )
{
info=x;
next=null;
}
}
Node f=null,r=null;
public boolean isEmpty()
{
if(f==null&&r==null)
return true;
else
return false;
}
public void enqueue(Scanner s)
{
int data;
System.out.println("enter data");
data=s.nextInt();
Node new_node=new Node(data);
if(isEmpty())
f=new_node;
r=new_node;
else
{
r.next=new_node
r=new_node;
}
}
public void dequeue()
{
if(isEmpty())
System.out.println("queue is empty");
else
{
System.out.println("data deleted "+f.info);
f=f.next;
}
}
public void display()
{
Node temp=f;
while(temp!=null)
{
System.out.print(temp.info+" ");
temp=temp.next;
}
}
}
public class Queuesll
{
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
Prgm6 q=new Prgm6();
do
{
System.out.println("press 1 to insert\n2 to delete\n3 to display");
n=s.nextInt();
switch(n)
{
case 1:q.enqueue(s);
	break;
case 2:q.dequeue();
	break;
case 3:q.display();
	break;
}
System.out.print("\npress 0 to continue:");
n=s.nextInt();
}
while(n==0);
}
}
