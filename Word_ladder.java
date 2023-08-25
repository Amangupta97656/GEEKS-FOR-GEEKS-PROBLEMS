
class Solution
{
    public class Pair{
        String key;
        int value;
        Pair(String k,int v){
            key=k;
            value=v;
        }
    }
    public int wordLadderLength(String startWord, String targetWord, String[] wordList)
    {
        HashSet<String>words = new HashSet<>();
        for(String ele:wordList) {
            words.add(ele);
        }
        Queue<Pair>q=new LinkedList<>();
        q.offer(new Pair(startWord,1));
        while(q.size()>0) {
            Pair currPeek = q.poll();
            String currWord = currPeek.key;
            int currCount=currPeek.value;
            if(currWord.equals(targetWord)) return currCount;
            words.remove(currWord);
            for(int i=0;i<currWord.length();i++){
                for(int j=0;j<26;j++){
                    char[] changedWord = currWord.toCharArray();
                    changedWord[i] = (char)('a'+j);
                    String changed = new String(changedWord);
                    if(words.contains(changed)){
                        q.offer(new Pair(changed,currCount+1));
                    }
                }
            }
        }
        return 0;
    }
}