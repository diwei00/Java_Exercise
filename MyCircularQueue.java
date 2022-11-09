//设计循环队列
//rear指向对头  front指向队尾的下一个  由于这样的结构需浪费一个空间
//由于是循环队列，走一步是 (rear + 1) % date.length
public class MyCircularQueue {
    private int[] date;
    private int front;
    private int rear;
    public MyCircularQueue(int k) {
        date = new int[k + 1];
    }

    public boolean enQueue(int value) {
        if(!isFull()) {
            date[rear] = value;
            rear = (rear + 1) % date.length;
            return true;
        }
        return false;

    }

    public boolean deQueue() {
        if(!isEmpty()) {
            front = (front + 1) % date.length;
            return true;
        }
        return false;
    }

    public int Front() {
        if(isEmpty()) {
            return -1;
        }
        return date[front];

    }

    public int Rear() {
        if(isEmpty()) {
            return -1;
        }
        int index = (rear == 0 ? date.length - 1: rear - 1);
        return date[index];

    }

    public boolean isEmpty() {
        return rear == front;
    }

    public boolean isFull() {
        return front == (rear + 1) % date.length;
    }
}

