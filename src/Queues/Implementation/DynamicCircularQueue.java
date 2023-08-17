package Queues.Implementation;

public class DynamicCircularQueue extends CircularQueue {
    public DynamicCircularQueue() {
        super();
    }

    public DynamicCircularQueue(int size) {
        super(size);
    }

    @Override
    public boolean add(int item) {
        if (isFull()) {                //double the size and copy the previous items
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {     //front is not increasing
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            rear = data.length;
            data = temp;
        }
        return super.add(item);
    }
}

