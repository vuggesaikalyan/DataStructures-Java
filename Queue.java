import java.util.Scanner;

class B{
    int i, rear=-1;
    int front=-1;
    int size=100;
    int[] que = new int[size];

    void enq(int t){
        int y=t;
        if(rear==size-1){
            System.out.println("Queue overflow");
        }
        else{
            rear=rear+1;
            que[rear]=y;
            if(front == -1){
                front = 0;
            }
        }
    }
    void deq(){
        if(front==-1 || front>rear){
            System.out.println("queue is empty");
        }
        else{
            System.out.println("the deleted element is"+que[front]);
            front=front+1;
        }
    }
    void display(){
        if(front==-1 || front>rear) {
            System.out.println("queue is empty");
        }
        else{
            System.out.println("elements of queue are:");
            for(i=front;i<=rear;i++) {
                System.out.println(que[i]);
            }
        }
    }
}
public class Queue<I extends Number> {
    public static void main(String args[]){
        int s, e,i;
        B obj = new B();
        System.out.println("enter your choice");
        System.out.println("1.enq\n2.deq\n3.display\n5.exit");
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 100; i++) {
            s = sc.nextInt();
            if(s == 1){
                System.out.println("enter the element to enqueue");
                e = sc.nextInt();
                obj.enq(e);
            }
            if(s == 2){
                obj.deq();
            }
            if(s == 3){
                obj.display();
            }
            if(s == 4){
                System.out.println("thank you");
                System.exit(0);
            }
            else if(s>4){
                System.out.println("Invalid option");
            }
        }
    }
}

