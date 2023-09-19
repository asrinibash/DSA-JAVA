package DSA_Sheet_ApnaCollege.String;

public class JP_03_validParenthesis {


    //solution :1 runs in 2ms
//    private static final Map<Character, Character> map = Map.of
//            ('(', ')', '{', '}', '[', ']');
//    public boolean isValid(String s) {
//        Stack<Character> stack = new Stack<>();
//        for (char c : s.toCharArray()) {
//            if (map.containsKey(c))
//                stack.push(c);
//            else {
//                if (stack.isEmpty())
//                    return false;
//                char open = stack.pop();
//                if (map.get(open) != c)
//                    return false;
//            }
//        }
//        return stack.isEmpty();
//    }


    //    solution: 2 runs in 0ms
    public boolean isValid(String s) {
        int i = -1;
        char[] stack = new char[s.length()];
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++i] = ch;
            } else {
                if (i >= 0 && ((stack[i] == '(' && ch == ')') || (stack[i] == '{' && ch == '}') || (stack[i] == '[' && ch == ']'))) {

                    i--;
                } else
                    return false;
            }
        }
        return i==-1;
    }
    // array : 0ms , arraylist/stack : 1ms , 2ms
}


