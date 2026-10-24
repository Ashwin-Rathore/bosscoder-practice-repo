package Bosscoder_Module_2.Session5_8Aug.Queue;

import java.util.Queue;

public class QueuePractice {
  
  static  int arr[];
  static  int size ;
  static  int front = -1;
  static int rear = -1;

  public QueuePractice(int n){
    arr = new int[n];
    size = n;  }


    public static  boolean isEmpty(){

        return rear ==-1 && front==-1;
    } //O(1)


    public static  boolean isFull(){
      return (rear+1)%size == front;
    }//O(1)

    public static void add(int data){
      if (isFull()) {
       System.out.println("Overflow");
        return ;
      }
      else if (front==1){
        front=0;
      }
      else{
        rear = (rear+1)%size;
        arr[rear] = data;
      }
    }


      public static int remove(){
        if (isEmpty()) {return -1;}
        int res = arr[front];
        if(front==rear){
          rear = front = -1;
        }else{
          front = (front+1)%size;
        }
        return res;
      }


      public static int peek(){
        if(isEmpty()) { return -1;}
        
        return arr[front];
      }

    public static void print(int [] a){
      for (int i : a) {
        System.out.println(i);
        
      }
    }

public static void main(String[] args) {
  
  QueuePractice q = new QueuePractice(4) ;
    QueuePractice.add(5);
    QueuePractice.add(10);
    QueuePractice.add(15);
    QueuePractice.add(20);
  
    print(arr);

}


}
