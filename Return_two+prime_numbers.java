class Solution{
    static List<Integer> primeDivision(int N){
        // code here
         ArrayList<Integer> list = new ArrayList<>();
         ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        
        for(int c = 0 ; c < list.size()  ; c++)
        {
            int s = N - list.get(c);
            if(list.contains(s))
            {
                list1.add(list.get(c));
                list1.add(s);
            }
           
        }
         return list1;
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}


