package ARRAYS;
public class DesignCircularQueue {
    /*
    Ques : Implement Circular Queue
    */
    int front = -1, rear = -1, size = 0;
    int arr[];
    public DesignCircularQueue(int k) {
        arr = new int[k];
        size = k;
    }
    public boolean enQueue(int value) {
        if (isFull())
            return false;
        if (front == -1) {
            rear = (rear + 1) % size;
            front = rear;
        } else {
            rear = (rear + 1) % size;
        }
        arr[rear] = value;
        return true;
    }
    public boolean deQueue() {
        if (isEmpty())
            return false;
        if (front == rear)
            front = rear = -1;
        else
            front = (front + 1) % size;
        return true;
    }
    public int Front() {
        if (isEmpty())
            return -1;
        return arr[front];
    }
    public int Rear() {
        if (isEmpty())
            return -1;
        return arr[rear];
    }
    public boolean isEmpty() {
        return front == -1;
    }
    public boolean isFull() {
        return front == (rear + 1) % size;
    }
}
