import java.util.*;
public class Prgm3
{
public class Node
{
int data;
Node next;
Node(int x)
{
data=x;
next=null;
}
}
Node head=null;//reference
Node temp=null;
public void create()
{
int x,n;
Scanner s=new Scanner(System.in);
System.out.println("ENTER DATA PRESS -1 TO STOP");
x=s.nextInt();
while(x!=-1)
{
Node new_node=new Node(x);//creating object of class node
if(head==null)
{
temp=head;
head=new_node;
temp=new_node;
}
else
{			
temp.next=new_node;//new_node.next=head;
temp=new_node;//head=new_node;
}
System.out.print("ENTER DATA PRESS -1 TO STOP:");
x=s.nextInt();
}
}
public void display()
{
Node temp=head;
if(head==null)
System.out.println("LIST IS EMPTY");
else
{
while(temp!=null)
{
System.out.print(temp.data +" ");
temp=temp.next;
}
}
}
public void delete()
{
int n,pos;
Scanner s=new Scanner(System.in);
do
{
if(head==null)
System.out.println("LIST IS EMPTY");
else
{
System.out.println("\nENTER 1 TO DELETE FROM THE BEGINGING ,2 TO DELETE FROM THE END AND 3 TO DELETE FROM A SPECIFIC LOCATION");
n=s.nextInt();
switch(n)
{
case 1:
	Node temp=head;	
	temp=temp.next;
	head=temp;
	break;
case 2:
	Node temp1=head;
	Node ptr=temp1.next;
	while(ptr!=null)
	{
	temp1=ptr;
	ptr=ptr.next;
	}
	temp1.next=null;
	break;
case 3:
	System.out.println("ENTER POSITION OF THE ELEMENT TO BE DELETED");
	pos=s.nextInt();
	Node temp2=head;
	Node ptr1=temp2.next;
	for(int i=0;i<pos-2;i++)
	{
	temp2=ptr1;
	ptr1=ptr1.next;
	}
	temp2.next=ptr1.next;
	break;
}
}
System.out.print("PRESS 1 IF YOU WANT TO DELETE AGAIN:");
n=s.nextInt();
}
while(n==1);
}
public static void main(String args[])
{
Prgm3 sll=new Prgm3();
sll.create();
sll.display();
sll.delete();
sll.display();
}
}