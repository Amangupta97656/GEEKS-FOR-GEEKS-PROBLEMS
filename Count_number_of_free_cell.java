  Set<Integer> row=new HashSet<>();

        Set<Integer> col=new HashSet<>();

        

        long[] ans = new long[K];//for storing the final result

        

        int r=N;

        int c=N;//this check for row and col are visited or not

        int curr_res=N*N;

        

        for(int i=0;i<K;i++)// 0 to k bcoz subset k=3

        {

            int x=arr[i][0];

            int y=arr[i][1];

            if(!row.contains(x)&&!col.contains(y))//both row and col not visited c--,r---;

            {

                curr_res=curr_res-r-c+1;

                c--;

                r--;

            }

            if(row.contains(x)&&!col.contains(y))// row visited and col not visited so c--;

            {

                curr_res=curr_res-r;

                c--;

            }

            if(!row.contains(x)&&col.contains(y))// col visited and row not visited so r--;

            {

                curr_res=curr_res-c;

                r--;

            }

            ans[i]=curr_res;//add  curr_res into array ans

            row.add(x); //add x into row set

            col.add(y); //add y int col set

            

            

        }

        return ans;

    }

}

