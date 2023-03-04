class Solution
{
    Node primeList(Node head){
        boolean isPrime[] = new boolean[100000];

         Arrays.fill(isPrime, true);

         primeGen(isPrime);

        Node curr =head;

        while(curr != null){

            if(curr.val == 1){

                curr.val = 2;

                curr = curr.next;

                continue;

            }

            

            int x = curr.val;

            int y = curr.val;

            while(!isPrime[x])x--;

            while(!isPrime[y])y++;

            

            if(curr.val - x > y - curr.val){

                curr.val = y;

            }

            else curr.val = x;

            

            curr = curr.next;

        }

        return head;

        

    }

    void primeGen(boolean isPrime[]){ // Sieve Of Eratosthenes

        for(int i = 2; i * i <= isPrime.length; i++){

            if(isPrime[i] == true){

                for(int j = i + i; j < isPrime.length; j += i){

                    isPrime[j] = false; // mark as not prime

                }

            }

        }

    }

}