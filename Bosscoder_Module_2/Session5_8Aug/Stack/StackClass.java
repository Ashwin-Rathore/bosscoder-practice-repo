package Bosscoder_Module_2.Session5_8Aug.Stack;

import java.util.ArrayList;

public class StackClass {
  

        static class Stack{
        static ArrayList<Integer>list = new ArrayList<>();
        
        public static boolean isEmpty(){
            return list.size() == 0;
        }//O(1)
        
        public static void push(int ele){
            list.add(ele);
        } //O(1)
        
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }//O(1)
        
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            
            return list.get(list.size()-1);
        }//O(1)
        
        
    }//O(1)

	public static void main(String[] args) {
		StackClass.Stack st = new StackClass.Stack();
		st.push(1); //1
		st.push(2); // 1 2
		st.push(3); //1 2 3
		
		while(!st.isEmpty()){
		    System.out.println(st.peek());
		    st.pop();
		} // 3 2 1
	}
}