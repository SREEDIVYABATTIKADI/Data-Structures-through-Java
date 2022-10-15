import java.util.*;
class Prgm17
{
class Node
{
int data;
Node next;
Node(int ele)
{
data=ele;
next=null;
}
}
Node f=null,r=null,temp=null;
boolean isEmpty()
{
if(f==null&&r==null)
return true;
else
return false;
}
void enqfirst(Scanner s)
{
System.out.print("ENTER ELEMENT AT FIRST:");
int ele=s.nextInt();
Node new_node=new Node(ele);
if(isEmpty())
{
f=new_node;
r=new_node;
}
else
{
new_node.next=f;
f=new_node;
}
}
void enqlast(Scanner s)
{
System.out.print("ENTER ELEMENT AT LAST:");
int ele=s.nextInt();
Node new_node=new Node(ele);
if(isEmpty())
{
f=new_node;
r=new_node;
}
else
{
r.next=new_node;
r=new_node;
}
}
void dqfirst()
{
if(isEmpty())
System.out.println("DEQUEUE IS EMPTY");
else if(f==r)
{
System.out.println("first element "+f.data+"is deleted");
f=null;
r=null;
}
else
{
System.out.println("first element "+f.data+"is deleted");
f=f.next;
}
}
void dqlast()
{
if(isEmpty())
System.out.println("DEQUEUE IS EMPTY");
else if(f==r)
{
System.out.println("last element "+r.data+" is deleted");
f=null;
r=null;
}
else
{
Node temp=f,temp1=null;
while(temp.next!=null)
{
temp1=temp;
temp=temp.next;
}
System.out.println("last element "+temp.data+" is deleted");
r=temp1;
r.next=null;
}
}
void display()
{
if(isEmpty())
System.out.println("DEQUEUE IS EMPTY");
else
{
temp=f;
while(temp!=null)
{
System.out.print(temp.data+" ");
temp=temp.next;
}
}
}
public static void main(String args[])
{
int m;
Scanner s=new Scanner(System.in);
Prgm17 dq=new Prgm17();
do
{
System.out.print("ENTER 1 TO ENQF,2 TO ENQL,3 TO DQF,4 TO DQL,5 TO DISPLAY:");
m=s.nextInt();
switch(m)
{
case 1:dq.enqfirst(s);
	break;
case 2:dq.enqlast(s);
	break;
case 3:dq.dqfirst();
	break;
case 4:dq.dqlast();
	break;
case 5:dq.display();
	break;
default:System.out.println("INVALID SELECTION");
	break;
}
System.out.print("PRESS 1 TO CONTINUE:");
m=s.nextInt();
}
while(m==1);
}
}







