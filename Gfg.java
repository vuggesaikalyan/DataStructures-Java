import java.util.*;
class Gfg
{
    static int getMinStepToReachEnd(int arr[], int N)
    {
        boolean []visit = new boolean[N];
        int []distance = new int[N];
        Vector<Integer> []digit = new Vector[10];
        for(int i = 0; i < 10; i++)
            digit[i] = new Vector<>();
        for(int i = 0; i < N; i++)
            visit[i] = false;
        for (int i = 1; i < N; i++)
            digit[arr[i]].add(i);
        distance[0] = 0;
        visit[0] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty())
        {
            int idx = q.peek();
            q.remove();
            if (idx == N - 1)
                break;
            int d = arr[idx];
            for (int i = 0; i < digit[d].size(); i++)
            {
                int nextidx = digit[d].get(i);
                if (!visit[nextidx])
                {
                    visit[nextidx] = true;
                    q.add(nextidx);
                    distance[nextidx] = distance[idx] + 1;
                }
            }

            digit[d].clear();

            if (idx - 1 >= 0 && !visit[idx - 1])
            {
                visit[idx - 1] = true;
                q.add(idx - 1);
                distance[idx - 1] = distance[idx] + 1;
            }
            if (idx + 1 < N && !visit[idx + 1])
            {
                visit[idx + 1] = true;
                q.add(idx + 1);
                distance[idx + 1] = distance[idx] + 1;
            }
        }

        return distance[N - 1];
    }
    public static void main(String []args)
    {
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 5,
                4, 3, 6, 0, 1, 2, 3, 4, 5, 7};
        int N = arr.length;
        System.out.println(getMinStepToReachEnd(arr, N));
    }
}

