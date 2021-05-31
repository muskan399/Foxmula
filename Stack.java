import java.util.*;
class Stack
{
    private int []s;
    private int top, max;
    Stack(int i)
    {
        max=i;
        s=new int[max];
        top=-1;
    }

    void push(int data)
    {
        if(top==max)
        {
            System.out.println("Stack is overflow");
        }
        else
        {
            s[++top]=data;
        }
    }

    int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is underflow");
            return 0;
        }
        else
        {
            return s[top--];
        }
    }

    boolean checkEmpty()
    {
        if(max==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int count()
    {
        if(top>-1)
            return (top+1);
        else
            return 0;
    }
}

class StackImp
{
    public void display(Stack St1, Stack St2)
    {
        if(St1.count()==St2.count())
        {
            System.out.println("Total number of elements in both stack are same: "+St2.count());
        }
    }

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        Stack S1=new Stack(20);
        Stack S2=new Stack(20);
        int ch,data;
        StackImp si=new StackImp();

        while(true)
        {
            System.out.println("\n@@@@@  Please Enter a valid choice  @@@@@@\n");
            System.out.println("\n1. Push in Stack 1");
            System.out.println("\n2. Pop in Stack 1");
            System.out.println("\n3. Push in Stack 2");
            System.out.println("\n4. Pop in Stack 1");
            System.out.println("\n5. Exit");

            ch=sc.nextInt();

            switch(ch)
            {
                case 1:
                    System.out.println("Enter the data");
                    data = sc.nextInt();
                    S1.push(data);
                    si.display(S1,S2);
                    break;

                case 2 :
                    System.out.println(S1.pop());
                    si.display(S1,S2);
                    break;

                case 3:
                    System.out.println("Enter the data");
                    data = sc.nextInt();
                    S2.push(data);
                    si.display(S1,S2);
                    break;

                case 4 :
                    System.out.println(S2.pop());
                    si.display(S1,S2);
                    break;

                case 5 :
                    System.exit(0);
                    break;
            }
        }
    }
}
