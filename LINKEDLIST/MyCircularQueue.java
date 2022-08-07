package LINKEDLIST;

public class MyCircularQueue {
    /*
    Ques: Design your implementation of the circular queue. The circular queue is a linear data structure
     in which the operations are performed based on FIFO (First In First Out)
     principle and the last position is connected back to the first position to make a circle. It is also called "Ring Buffer
     */
    int front=-1,rear=-1,size=0;int[] arr;
    public MyCircularQueue(int k) {
        arr=new int[size=k];

    }
    public boolean enQueue(int value) {
        if(isFull())return false;
        if(front==-1)
            front=rear=(rear+1)%size;
        else
            rear=(rear+1)%size;
        arr[rear]=value;
        return true;
    }
    public boolean deQueue() {
        if(isEmpty())return false;
        if(front==rear)
            front=rear=-1;
        else
            front=(front+1)%size;
        return true;
    }
    public int Front() {
        return !isEmpty()?arr[front]:-1;
    }
    public int Rear() {
        return !isEmpty()?arr[rear]:-1;
    }
    public boolean isEmpty() {
        return front==-1;
    }
    public boolean isFull() {
        return front==(rear+1)%size;
    }
}
