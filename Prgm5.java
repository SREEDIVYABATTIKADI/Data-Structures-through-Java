import java.util.*;
class Prgm5
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
Node top=null;
public boolean isEmpty()
{
if(top==null)
return true;
else
return false;
}
void push(Scanner s)
{
System.out.print("enter element:");
int ele=s.nextInt();
Node new_node=new Node(ele);
if(isEmpty())
top=new_node;
else
{
new_node.next=top;
top=new_node;
}
}
void pop()
{
if(isEmpty())
System.out.println("stack is empty");
else
{
Node temp=top;
top=top.next;
System.out.println(temp.data+" is deleted");
}
}
void display()
{
if(isEmpty())
System.out.println("stack is empty");
else
{
System.out.println("The elements are:");
Node temp=top;
while(temp!=null)
{
System.out.print(temp.data+" ");
temp=temp.next;
}
}
}
public static void main(String args[])
{
int n;
Scanner s=new Scanner(System.in);
Prgm5 st=new Prgm5();
do
{
System.out.print("ENTER 1 TO PUSH,2 TO POP,3 TO DISPLAY IN REVERSE ORDER:");
n=s.nextInt();
switch(n)
{
case 1:st.push(s);
	break;
case 2:st.pop();
	break;
case 3:st.display();
	break;
default:System.out.println("INVALID SELECTION");
	break;
}
System.out.print("PRESS 1 TO CONTINUE:");
n=s.nextInt();
}
while(n==1);
}
}

