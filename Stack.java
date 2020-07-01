import java.util.Scanner;
class Methods{
    int t=-1,size=100,i;
    int[] stack = new int[size];

    void push(int x){
        int y = x;
         if (t==size-1) {
             System.out.println("stack is full");
         }
         else{
             t=t+1;
             stack[t] = y;
             System.out.println(stack[t]);
         }

    }
    void pop(){
        if(t==-1){
            System.out.println("Stack is empty");
        }
        else{
            t=t-1;
        }
    }
    void top(){
        if (t==-1){
            System.out.println("stack is empty");
        }
        else{
            System.out.println("the top element is:");
            System.out.println(stack[t]);
        }
    }
    void display(){
        if (t==-1) {
            System.out.println("stack is empty");
        }
        else{
            for (i = t; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

}
public class Stack {
    public static void main(String[] args) {
        int s, e,i;
        Methods obj = new Methods();
        System.out.println("enter your choice");
        System.out.println("1.push\n2.pop\n3.top\n4.display\n5.exit");
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < 100; i++) {
            s = sc.nextInt();
            if(s == 1){
                System.out.println("enter the element to push");
                e = sc.nextInt();
                obj.push(e);
            }
            if(s == 2){
                obj.pop();
            }
            if(s == 3){
                obj.top();
            }
            if(s == 4){
                obj.display();
            }
            if(s == 5){
                System.out.println("thank you");
                System.exit(0);
            }
            else if(s>5){
                System.out.println("Invalid option");
            }
        }
    }
}

