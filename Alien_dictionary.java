class Solution
{
    public String findOrder(String [] dict, int N, int K)
    {
        // Write your code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<K;i++)adj.add(new ArrayList<Integer>());
        for(int i=0;i<N-1;i++)
        {
            String s1=dict[i];
            String s2=dict[i+1];
            for(int j=0;j<Math.min(s1.length(),s2.length());j++)
            {
                if(s1.charAt(j)!=s2.charAt(j))
                {
                    adj.get(s1.charAt(j)-97).add(s2.charAt(j)-97);
                    break;
                }
            }
        }
       int indegree[]=new int[K];
       for(ArrayList<Integer> arr: adj)
       {
           for(int x: arr)indegree[x]++;
       }
       Queue<Integer> q=new LinkedList<>();
       for(int i=0;i<indegree.length;i++)
       {
           if(indegree[i]==0)q.add(i);
       }
       StringBuilder ans=new StringBuilder();
       while(!q.isEmpty())
       {
           int temp=q.poll();
           ans.append((char)(temp+97));
           for(int x: adj.get(temp))
           {
               indegree[x]--;
               if(indegree[x]==0)
               {
                   q.add(x);
               }
           }
       }
       return ans.toString();
    }
}