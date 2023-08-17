package Queues.Implementation;

public class CircularQueue {
    protected static final int DEFAULT_SIZE = 10;
    protected int[] data;
    protected int index = 0;
    protected int front = 0;
    protected int rear = 0;

    CircularQueue() {
        this(DEFAULT_SIZE);
    }

    CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return index == data.length;
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public boolean add(int item) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return false;
        }
        data[rear++] = item;
        rear = rear % data.length;
        index++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        int removeItem = data[front++];
        front %= data.length;
        index--;
        return removeItem;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + "<-");
            i++;
            i %= data.length;
        } while (i != rear);
        System.out.println("End");
    }
}
