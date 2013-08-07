package org.lavanya.testprograms;

public class QueueUsingStack {
	StackX stack = new StackX();

    public void enque(int data){
        stack.push(data);
    }

    public void deque(){
         reverse(stack);
    }

    public void reverse(StackX stack){

        int temp = stack.pop();
        if(stack.isEmpty())
            return;
        reverse(stack);
        stack.push(temp);
    }

	
	public static void main(String[] args) {
		 QueueUsingStack queueUsingStack = new QueueUsingStack();
	        queueUsingStack.enque(45);
	        queueUsingStack.enque(3);
	        queueUsingStack.enque(13);
	        queueUsingStack.enque(56);
	        queueUsingStack.enque(123);

	        System.out.println("Input:: ");
	        queueUsingStack.stack.print();

	        queueUsingStack.deque();
	        System.out.println();
	        System.out.println("Output :: after 1st deque");
	        queueUsingStack.stack.print();

	        queueUsingStack.deque();
	        System.out.println();
	        System.out.println("Output :: after 2nd deque");
	        queueUsingStack.stack.print();

	        queueUsingStack.enque(999);
	        System.out.println();
	        System.out.println("Output :: after 999 enque");
	        queueUsingStack.stack.print();
		
	}

}
