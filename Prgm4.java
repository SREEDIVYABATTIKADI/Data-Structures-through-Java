import java.util.*;
public class Prgm4
{
int top=-1,a[];
Prgm4(int n)
{
a=new int[n];
}
public boolean isEmpty()
{
if(top==-1)
return true;
else
return false;
}
public boolean isFull()
{
if(top==a.length-1)
return true;
else
return false;
}
void push(Scanner s)
{
if(isFull())
System.out.println("stack is full");
else
{
System.out.println("enter element");
int ele=s.nextInt();
top=top+1;
a[top]=ele;
System.out.println("element inserted");
}
}
void pop()
{
if(isEmpty())
System.out.println("stack is empty");
else
{
int d=a[top];
top=top-1;
System.out.println(d+"is deleted");
}
}
void display()
{
if(isEmpty())
System.out.println("stack is empty");
else
{
System.out.println("Elements are:");
for(int i=0;i<=top;i++)
System.out.print(a[i]+" ");
}
}
void displayrev()
{
if(isEmpty())
System.out.println("stack is empty");
else
{
System.out.println("Elements in reverse order:");
for(int i=top;i>=0;i--)
System.out.print(a[i]+" ");
}
}
public static void main(String args[])
{
int m,n;
System.out.println("enter size");
Scanner s=new Scanner(System.in);
n=s.nextInt();
Prgm4 st=new Prgm4(n);
do
{
System.out.println("enter 1 to push,2 to pop,3 to display,4 to display in reverse order");
m=s.nextInt(); 
switch(m)
{
case 1:st.push(s);
	break;
case 2:st.pop();
	break;
case 3:st.display();
	break;
case 4:st.displayrev();
	break;
default:System.out.println("INVALID SELECTION");
}
System.out.print("\n press 1 to continue:");
m=s.nextInt();
}
while(m==1);
}
}

