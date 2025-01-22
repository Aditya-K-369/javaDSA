import java.util.Stack;

public class StackLL1 {
    //reverse the stack
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return ;
        }
        int top = s.pop();
        reverseStack(s);
        pushatbottom(top, s);
    }

    //pushatbottom question
    public static void pushatbottom(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushatbottom(data, s);
        s.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseStack(s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
            
        }
    }
}
