package Stack.Implementation;

public class CustomStack {
    protected static final int DEFAULT_SIZE = 10;
    protected int[] data;
    int index = -1;

    CustomStack() {
        this(DEFAULT_SIZE);  //Introducing this constructor, represents it own constructor
    }

    CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("stack is overflow");
            return false;
        }
        index++;
        data[index] = item;
        return true;
    }

    public int pop() throws StackException{
        if (isEmpty()) {
            throw new StackException("Cannot pop from Empty Stack");
        }
        int item = data[index];
        index--;
        return item;
    }
    public int peek()throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek from Empty Stack");
        }
        return data[index];
    }
    public void traversal(){
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        for (int i = 0; i <= index; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

    public boolean isFull() {
        return index == data.length-1;  //index at last index
    }

    public boolean isEmpty() {
        return index == -1;
    }

}
