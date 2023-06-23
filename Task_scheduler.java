class Solution {
    static int leastInterval(int N, int K, char tasks[]) {
        // code here
        int[] freq = new int[26];
        
        for (int task : tasks) {
            freq[task - 'A']++;
        }
        
        int[] activationTime = new int[26];
        
        int cnt = 0;
        int time = 0;
        int maxFreq = -1;
        
        while (cnt < N) {
            maxFreq = getMax(freq, activationTime, time);
            
            if (maxFreq > -1) {
                cnt++;
                freq[maxFreq]--;
                activationTime[maxFreq] = time + K + 1;
            }
            
            // System.out.print (maxFreq + " ");
            
            time++;
        }
        
        return time;
    }
    
    private static int getMax(int[] freq, int[] activationTime, int currTime) {
        int maxFreq = 0;
        int idx = -1;
        
        for (int i = 0 ; i < 26 ; i++) {
            if (freq[i] > maxFreq && activationTime[i] <= currTime) {
                maxFreq = freq[i];
                idx = i;
            }
        }
        
        return idx;
    }
}
