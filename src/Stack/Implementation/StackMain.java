package Stack.Implementation;

public class StackMain {
    public static void main(String[] args) throws StackException {
        DynamicStack cs=new DynamicStack();
      //  CustomStack  cs=new CustomStack(5);
        cs.push(4);
        cs.push(2);
        cs.push(6);
        cs.push(8);
        cs.push(1);
        cs.push(5);
        cs.push(5);
        cs.push(5);
        cs.push(5);
        cs.push(5);
        cs.push(5);
        cs.push(5);
        cs.push(5);
        cs.traversal();
//      System.out.println(cs.peek());
        cs.traversal();
    }
}
