import java.io.*;
import java.util.*;

public class BfsRunner {
    static void breadthFirstSearch(int[][] matrix, int source){
        boolean[] visited = new boolean[matrix.length];
        visited[source-1] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        System.out.println("The breadth first order is");
        while(!queue.isEmpty()){
            System.out.println(queue.peek());
            int x = queue.poll();
            int i;
            for(i=0; i<matrix.length;i++){
                if(matrix[x-1][i] == 1 && visited[i] == false){
                    queue.add(i+1);
                    visited[i] = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int vertices;
        System.out.println("Enter the number of vertices ");
        try{
            vertices = Integer.parseInt(br.readLine());
        }catch(IOException e){
            System.out.println("An error occurred");
            return;
        }
        int[][] matrix = new int[vertices][vertices];
        System.out.println("Enter the adjacency matrix");
        int i,j;
        for(i=0; i<vertices; i++){
            for(j=0; j<vertices; j++){
                try{
                    matrix[i][j] = Integer.parseInt(br.readLine());
                }catch (IOException e){
                    System.out.println("error");
                }
            }
        }
        int source;
        System.out.println("Enter the source vertex");
        try{
            source = Integer.parseInt(br.readLine());
        }catch(IOException e){
            System.out.println("error");
            return;
        }
        breadthFirstSearch(matrix,source);
    }
}