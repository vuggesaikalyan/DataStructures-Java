import java.util.Scanner;
class C {
    int i, rear = -1;
    int front = -1;
    int size = 100;
    int[] cque = new int[size];

    void cenq(int t) {
        int y = t;
        if (rear == (front+1)%size) {
            System.out.println("Queue overflow");
        }
        else {
            rear = (rear + 1)%size;
            cque[rear] = y;
            if (front == -1) {
                front = 0;
            }
        }
    }

    void cdeq() {
        if (front == -1 && rear == -1) {
            System.out.println("queue is empty");
        }
        else if(front == rear) {
            System.out.println("the deleted element is" + cque[front]);
            front = -1;
            rear = -1;
        }
        else{
            System.out.println("the deleted element is:" +cque[front]);
            front = (front+1)%size;
        }
    }

    void display() {
        if (front == -1 && rear == -1){
            System.out.println("queue is empty");
        }
        else {
            System.out.println("elements of queue are:");
            for (i = front; i != rear; i=(i+1)%size) {
                System.out.println(cque[i]);
            }
        }
    }
}
public class CircularQueue {
    public static void main(String args[]) {
        int s, e, i;
        C obj = new C();
        System.out.println("enter your choice");
        System.out.println("1.cenq\n2.cdeq\n3.display\n5.exit");
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 100; i++) {
            s = sc.nextInt();
            if (s == 1) {
                System.out.println("enter the element to enqueue");
                e = sc.nextInt();
                obj.cenq(e);
            }
            if (s == 2) {
                obj.cdeq();
            }
            if (s == 3) {
                obj.display();
            }
            if (s == 4) {
                System.out.println("thank you");
                System.exit(0);
            } else if (s > 4) {
                System.out.println("Invalid option");
            }
        }
    }
}

