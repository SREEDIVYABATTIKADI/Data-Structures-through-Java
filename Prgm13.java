import java.util.*;
public class Prgm13
{
public class Node
{
int info;
Node next;
Node prev;
Node(int y)
{
info=y;
next=prev=null;
}
}
Node head=null;// creating reference
Node tail=null;//creating reference
public void create()
{
int x,n;
do
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER DATA :");
x=s.nextInt();
Node new_node=new Node(x);//creating object new_node of class node 
if(head==null)
{
head=new_node;
tail=new_node;
}
else
{
new_node.next=head;
head.prev=new_node;
head=new_node;
}
System.out.print("PRESS 1 TO CONTINUE:");
n=s.nextInt();
}
while(n==1);
}
public void displaylr()
{
Node temp=head;
if(temp==null)
System.out.println("LIST IS EMPTY");
else
{
while(temp!=null)
{
System.out.print(temp.info +" ");
temp=temp.next;
}
}
}
public void displayrl()
{
Node temp=tail;
if(temp==null)
System.out.println("LIST IS EMPTY");
else
{
while(temp!=null)
{
System.out.print(temp.info +" ");
temp=temp.prev;
}
}
}
public void delete()
{
int n,pos;
Node temp=head,temp1=tail,ptr=temp.next;
Scanner s=new Scanner(System.in);
do
{
if(head==null)
System.out.println("LIST IS EMPTY");
else
{
System.out.println("\nENTER 1 TO DELETE AT THE BEGIN,2 TO DELETE AT THE END AND 3 TO DELETE AT A SPECIFIC POSITION");
n=s.nextInt();
switch(n)
{
case 1:	temp=temp.next;                                          
	head=temp;
	head.prev=null;
	break;
case 2: temp1=temp1.prev;	
	temp1.next=null;
	tail=temp1;	
	break;
case 3:	System.out.println("ENTER POSITION OF  AN ELEMENT TO BE DELETED");
	pos=s.nextInt();
	for(int i=0;i<pos-2;i++)
	{
	temp=temp.next;
	ptr=ptr.next;
	}
	temp.next=ptr.next;
	ptr.next.prev=temp;
	break;
}
}
System.out.println("PRESS 1 IF YOU WANT TO DELETE AGAIN");
n=s.nextInt();
}
while(n==1);
}
public static void main(String args[])
{
Prgm13 dll=new Prgm13();
dll.create();
dll.displaylr();
dll.delete();
dll.displaylr();
}
}
/*case 2:while(ptr.next!=null)
	{
	temp=temp.next;
	ptr=ptr.next;
	}
	temp.next=null;
	tail=temp;
	break;*/






