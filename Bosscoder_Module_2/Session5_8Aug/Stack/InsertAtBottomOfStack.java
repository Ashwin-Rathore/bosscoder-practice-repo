package Bosscoder_Module_2.Session5_8Aug.Stack;

import java.util.Stack;

public class InsertAtBottomOfStack {
  
public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
       printStack(st,x);
        
    }
    
    
    public void printStack(Stack<Integer> st, int x){
              if(st.isEmpty()){
                st.push(x);
              }else{
                st.pop();
                st.p
                System.out.println(st.peek());
              }
              printStack(st, x);
            
        
    }

}
