class Complete {
    
    //define global variables
    static int maxCount = 0;
    static ArrayList<Integer> primeNumbers;

    public static void precompute() {
    	//Precomputes prime numbers up to a certain limit.
        primeNumbers = new ArrayList<>();
        int limit = 1299227; //according to the constraint 100000th prime number is 1299227
        int[] sieve = new int[limit + 1];
        
        // Sieve of Eratosthenes algorithm to find prime numbers
        for (int i = 2; i <= limit && i * i <= limit; i++) {
            if (sieve[i] == 0) {
                for (int j = i * i; j <= limit; j += i) {
                    sieve[j] = 1;
                }
            }
        }
        
        // Store prime numbers in the list
        for (int i = 2; i <= limit; i++) {
            if (sieve[i] == 0) {
                primeNumbers.add(i);
            }
        }
    }

    public static void calculateGroupSize(List<List<Integer>> adjList, boolean[] visited, int source) {
        //Calculates the size of the group connected to the given source node.
        
        visited[source] = true;
        maxCount++;
        
        for (int neighbor : adjList.get(source)) {
            if (!visited[neighbor]) {
                calculateGroupSize(adjList, visited, neighbor);
            }
        }
    }

    public static int helpSanta(int n, int m, int[][] connections) {
        if (m == 0) {
            return -1;
        }
        
        List<List<Integer>> adjList = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        
        for (int i = 0; i < m; i++) {
            int from = connections[i][0] - 1;
            int to = connections[i][1] - 1;
            
            adjList.get(from).add(to);
            adjList.get(to).add(from);
        }
        
        int largestGroupSize = Integer.MIN_VALUE;
        boolean[] visited = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            maxCount = 0;
            
            if (!visited[i]) {
                calculateGroupSize(adjList, visited, i);
                
                if (maxCount > largestGroupSize) {
                    largestGroupSize = maxCount;
                }
            }
        }
        
        return primeNumbers.get(largestGroupSize - 1);
    }
}