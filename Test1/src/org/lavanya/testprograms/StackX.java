package org.lavanya.testprograms;

public class StackX {

	private final int SIZE = 5;
    private int[] st;
    private int top;
    
    public StackX(){
        st = new int[SIZE]; // make array
        top = -1;
    }
    public void push(int j){ // put item on stack
        st[++top] = j; 
    }

    public int pop() {// take item off stack
        return st[top--]; 
    }
    
    public int peek() {// peek at top of stack
        return st[top]; 
    }
    
    public boolean isEmpty(){ // true if nothing on stack
        return (top == -1); 
    }
    
    public void print(){
        for(int i = 0; i<=top; i++)
            System.out.print("::"+ st[i]);
    }
        

}
