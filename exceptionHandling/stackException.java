package exceptionHandling;

public class stackException {
    public static void main(String[] args) {
        stack s = new stack(5);
        try
        {
        s.push(10);
        s.push(15);
        s.push(10);
        s.push(15);
        // s.push(10);
        // s.push(15);
        int z=s.pop();
        System.out.println(z);
        }
        catch(StackOverflow e)
        {
            System.out.println(e);
        }
        catch(StackUnderflow e)
        {
            System.out.println(e);
        }
    }
}

class stack{
    private int size;
    private int top=-1;
    private int S[];

    public stack(int sz){
        size = sz;
        S = new int[sz];
    }

    public void push(int x) throws StackOverflow{
        if(top==size-1){
            throw new StackOverflow();
        }
        top++;
        S[top] = x;
    }
    public int pop() throws StackUnderflow{
        int x=-1;
        if(top==-1){
            throw new StackUnderflow();
        }
        x=S[top];
        top--;
        return x;
    }
}

class StackUnderflow extends Exception{
    public String toString(){
        return "Stack is empty";
    }
}
class StackOverflow extends Exception{
    public String toString(){
        return "Stack is full";
    }
}