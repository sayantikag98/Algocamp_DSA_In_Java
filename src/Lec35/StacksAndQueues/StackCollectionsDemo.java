package Lec35.StacksAndQueues;

import java.util.Stack;

public class StackCollectionsDemo {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st);
        st.push(30);
        System.out.println(st);
        st.push(50);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st);
    }
}
