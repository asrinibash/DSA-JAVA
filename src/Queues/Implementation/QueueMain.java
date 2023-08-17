package Queues.Implementation;

public class QueueMain {
    public static void main(String[] args) throws Exception {
//      CustomQueues queue=new CustomQueues(5);
        CircularQueue queue = new CircularQueue(5);
        queue.add(5);
        queue.add(2);
        queue.add(3);
        queue.add(1);
        queue.add(6);
        queue.display();
        System.out.println(queue.front());
        queue.remove();
        queue.add(10);

        queue.display();
    }
}
