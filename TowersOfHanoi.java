import java.util.*;
class A{
    void move(int n,char source,char auxilliary,char destination){
        if(n == 1){
            System.out.println("move disk from"+source +"to"+destination);
        }
        else{
            move(n-1,source,destination,auxilliary);
            move(1,source,auxilliary,destination);
            move(n-1,auxilliary,source,destination);
        }
    }
}
public class TowersOfHanoi {
    public static void main(String args[]){
        System.out.println("enter number of discs:");
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       A obj = new A();
       obj.move(N,'S','A','D');
    }
}
