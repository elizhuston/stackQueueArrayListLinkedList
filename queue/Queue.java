package queue;

import stack.Stack;

public class Queue {
    
    private int[] vals;
    private int start;
    private int size;
    private int next;
    
    public int size() {
        return this.size;
    }
    
    public void enqueue(int a) {	
        if (this.size >= this.vals.length) {
            int[] arr = new int[this.vals.length * 2];
            for (int i = 0; i < this.size; i++) {
                arr[i] = this.vals[i];
            }
        this.vals = arr;
        }
        this.vals[this.start] = a;
        this.size++;
        this.start++;
        return;
    }  
    
    
    public int dequeue() {
        if (this.next >= this.size-1) {
            throw new RuntimeException("nothing more to dequeue");
        }
        this.next++;
        return this.vals[this.next];

      
    }
    
    public Queue() {
        this.vals = new int[10];
        this.start = 0;
        this.size = 0;
        this.next=-1;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Queue q;
        q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }

}