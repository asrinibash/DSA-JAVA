package Queues.Implementation;

public class CustomQueues {
    protected static final int DEFAULT_SIZE = 10;
    protected int[] data;
    int index = 0;

    CustomQueues() {
        this(DEFAULT_SIZE);
    }

    CustomQueues(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return index == data.length;
    }

    public boolean isEmpty() {
        return index == -1;
    }

    public boolean add(int item) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return false;
        }
        data[index++] = item;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        int removeItem = data[0];
        for (int i = 1; i < index; i++) {
            data[i - 1] = data[i];
        }
        index--;
        return removeItem;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        return data[0];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = 0; i < index; i++) {
            System.out.print(data[i] + "<-");
        }
        System.out.println("End");
    }
}
