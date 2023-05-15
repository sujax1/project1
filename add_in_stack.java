import java.util.*;
public class add_in_stack{
    public static void add(Stack<Integer> s,int n){
        if(s.isEmpty()){
         s.push(n);
         return;
        }
       int top = s.pop();
        add(s,n);
        s.push(top);
    }
    public static void main(String arg[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        add(s,5);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }

    }
}